package gestao.eventos.entidades.eventos;

import gestao.eventos.entidades.Local;
import gestao.eventos.entidades.pessoas.Participante;

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

    public void adicionaParticipante(Participante participante) {
        participantes.add(participante);
    }

    public String getEventoId() {
        return eventoId;
    }

    // apenas teste - printa os atributos do evento
    public void printaEvento() {
        System.out.println(eventoId);
        System.out.println(nome);
        System.out.println(descricao);
        System.out.println(tempoInicio.toLocalDate());// data 1
        System.out.println(tempoFim.toLocalTime());// hora 2
        System.out.println(local.getNome());
        System.out.println(participantes.get(0).getNome());
    }
}
