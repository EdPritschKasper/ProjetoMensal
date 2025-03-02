package gestao.eventos.entidades.eventos;

import gestao.eventos.entidades.Local;
import gestao.eventos.entidades.pessoas.Musico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class ShowMusical extends Evento {
    private List<Musico> musicos;

    public ShowMusical(String eventoId, String nome, String descricao, LocalDateTime tempoInicio, LocalDateTime tempoFim, Local local){
        super(eventoId, nome, descricao, tempoInicio, tempoFim, local);
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
