package gestao.eventos.entidades.eventos;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.StatusEvento;
import gestao.eventos.entidades.Local;
import gestao.eventos.entidades.pessoas.Participante;
import gestao.eventos.interfaces.IChecaEvento;
import gestao.eventos.interfaces.IPrinta;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.ArrayList;

public abstract class Evento implements IPrinta, IChecaEvento {
    protected String eventoId;
    protected String nome;
    protected String descricao;
    protected LocalDateTime tempoInicio;
    protected LocalDateTime tempoFim;
    protected Local local;
    protected List<Participante> participantes;
    protected StatusEvento statusEvento;

    // construtor parametrizado
    public Evento(String eventoId, String nome, String descricao, LocalDateTime tempoInicio, LocalDateTime tempoFim, Local local) {
        this.eventoId = eventoId;
        this.nome = nome;
        this.descricao = descricao;
        this.tempoInicio = tempoInicio;
        this.tempoFim = tempoFim;
        this.local = local;
        this.participantes = new ArrayList<>();
        this.statusEvento = StatusEvento.PENDENTE;
    }

    // construtor padrao
    public Evento(){
        this.participantes = new ArrayList<>();
        this.statusEvento = StatusEvento.PENDENTE;
    }

    public void adicionaParticipante(String documento) {
        BancoDeDados banco = BancoDeDados.getInstancia();
        participantes.add(banco.getParticipante(documento));
    }

    // metodo abstrato
    public abstract void adicionaApresentador(String documento);

    // metodo interface IPrinta
    public void printaAtributos() {
        System.out.println("ID: " + getEventoId());
        System.out.println("Nome: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Tempo Inicio: " + getTempoInicio());
        System.out.println("Tempo Fim: " + getTempoFim());
        System.out.println("Quantidade de participantes: " + participantes.size());
    }

    // metodo interface IChecaEvento
    public void checaStatusEvento(){
        long diasAteInicio = ChronoUnit.DAYS.between(
                LocalDateTime.now().toLocalDate(),
                this.tempoInicio.toLocalDate()
        );
        if(diasAteInicio <= 7 && participantes.size() <= 2) {
            setStatusEvento(StatusEvento.CANCELADO);
        } else {
            setStatusEvento(StatusEvento.CONFIRMADO);
        }
    }

    public void copiaAtributos(Evento evento) {
        this.eventoId = evento.getEventoId();
        this.nome = evento.getNome();
        this.descricao = evento.getDescricao();
        this.tempoInicio = evento.getTempoInicio();
        this.tempoFim = evento.getTempoFim();
        this.local = evento.getLocal();
        this.participantes = evento.getParticipantes();
        this.statusEvento = evento.getStatusEvento();
    }

    public void setStatusEvento(StatusEvento statusEvento){
        this.statusEvento = statusEvento;
    }

    public StatusEvento getStatusEvento() {
        return this.statusEvento;
    }

    public String getEventoId() {
        return eventoId;
    }

    public void setEventoId(String eventoId) {
        this.eventoId = eventoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getTempoInicio() {
        return tempoInicio;
    }

    // POLIMORFISMO - SOBRECARGA - SET TEMPO INICIO
    public void setTempoInicio(int ano, int mes, int dia, int hora, int minuto) {
        this.tempoInicio = LocalDateTime.of(ano, mes, dia, hora, minuto);
    }

    public void setTempoInicio(LocalDateTime tempoInicio) {
        this.tempoInicio = tempoInicio;
    }

    public LocalDateTime getTempoFim() {
        return tempoFim;
    }

    // POLIMORFISMO - SOBRECARGA - SET TEMPO FIM
    public void setTempoFim(int ano, int mes, int dia, int hora, int minuto) {
        this.tempoFim = LocalDateTime.of(ano, mes, dia, hora, minuto);
    }

    public void setTempoFim(LocalDateTime tempoFim) {
        this.tempoFim = tempoFim;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(String nome) {
        BancoDeDados banco = BancoDeDados.getInstancia();
        this.local = banco.getLocal(nome);
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}
