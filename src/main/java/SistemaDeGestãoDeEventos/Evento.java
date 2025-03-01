package SistemaDeGestãoDeEventos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Evento {
    protected String evento_id;
    protected String nome;
    protected String descricao;
    protected LocalDateTime tempoInicio;
    protected LocalDateTime tempoFim;
    protected Local local;
    protected List<Palestrante> palestrantes;
    protected List<Participantes> participantes;

    public Evento(String evento_id, String nome, String descricao, LocalDateTime tempoInicio, LocalDateTime tempoFim, Local local) {
        this.evento_id = evento_id;
        this.nome = nome;
        this.descricao = descricao;
        this.tempoInicio = tempoInicio;
        this.tempoFim = tempoFim;
        this.local = local;
        this.palestrantes = new ArrayList<>();
        this.participantes = new ArrayList<>();
    }

    public void adicionaPalestrante(Palestrante palestrante) {
        palestrantes.add(palestrante);
    }

    public void adicionaParticipante(Participantes participante) {
        participantes.add(participante);
    }

    // apenas teste - printa os atributos do evento
    public void getEvento() {
        System.out.println(evento_id);
        System.out.println(nome);
        System.out.println(descricao);
        System.out.println(tempoInicio.toLocalDate());
        System.out.println(tempoFim.toLocalTime());
        System.out.println(local);
        System.out.println(palestrantes.get(0));
        System.out.println(participantes.get(0));
        System.out.println(local);
    }
}
