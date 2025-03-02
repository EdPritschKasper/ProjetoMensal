package SistemaDeGestãoDeEventos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class ShowMusical extends Evento {
    private List<Musico> musicos;

    public ShowMusical(String evento_id, String nome, String descricao, LocalDateTime tempoInicio, LocalDateTime tempoFim, Local local){
        super(evento_id, nome, descricao, tempoInicio, tempoFim, local);
        musicos = new ArrayList<>();
    }

    public void adicionaMusico(Musico musico) {
        musicos.add(musico);
    }

    public void printaMusical() {
        printaEvento();
        System.out.println(musicos.get(0).getNome());
    }
}
