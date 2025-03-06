package gestao.eventos.entidades.eventos;

import gestao.eventos.entidades.Local;
import gestao.eventos.entidades.pessoas.Participante;
import gestao.eventos.BancoDeDados;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public abstract class Evento {
    protected String eventoId;
    protected String nome;
    protected String descricao;
    protected LocalDateTime tempoInicio;
    protected LocalDateTime tempoFim;
    protected Local local;
    protected List<Participante> participantes;

    public Evento(String eventoId, String nome, String descricao, LocalDateTime tempoInicio, LocalDateTime tempoFim, Local local) {
        this.eventoId = eventoId;
        this.nome = nome;
        this.descricao = descricao;
        this.tempoInicio = tempoInicio;
        this.tempoFim = tempoFim;
        this.local = local;
        this.participantes = new ArrayList<>();
    }

    public Evento(){
        this.participantes = new ArrayList<>();
    }

    public void adicionaParticipante(String documento) {
        BancoDeDados banco = BancoDeDados.getInstancia();
        participantes.add(banco.getParticipante(documento));
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

    public void setTempoInicio(LocalDateTime tempoInicio) {
        this.tempoInicio = tempoInicio;
    }

    public LocalDateTime getTempoFim() {
        return tempoFim;
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
}
