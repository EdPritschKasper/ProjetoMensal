package SistemaDeGestãoDeEventos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public abstract class Evento {
    protected String evento_id;
    protected String nome;
    protected String descricao;
    protected LocalDateTime tempoInicio;
    protected LocalDateTime tempoFim;
    protected Local local;
    protected List<Participantes> participantes;

    public Evento(String evento_id, String nome, String descricao, LocalDateTime tempoInicio, LocalDateTime tempoFim, Local local) {
        this.evento_id = evento_id;
        this.nome = nome;
        this.descricao = descricao;
        this.tempoInicio = tempoInicio;
        this.tempoFim = tempoFim;
        this.local = local;
        this.participantes = new ArrayList<>();
    }

    public void adicionaParticipante(Participantes participante) {
        participantes.add(participante);
    }

    // apenas teste - printa os atributos do evento
    public void printaEvento() {
        System.out.println(evento_id);
        System.out.println(nome);
        System.out.println(descricao);
        System.out.println(tempoInicio.toLocalDate());// data 1
        System.out.println(tempoFim.toLocalTime());// hora 2
        System.out.println(local.getNome());
        System.out.println(participantes.get(0).getNome());
    }
}
