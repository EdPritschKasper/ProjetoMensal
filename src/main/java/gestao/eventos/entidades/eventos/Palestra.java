package gestao.eventos.entidades.eventos;

import gestao.eventos.entidades.Local;
import gestao.eventos.entidades.pessoas.Palestrante;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Palestra extends Evento{
    private List<Palestrante> palestrantes;

    public Palestra(String evento_id, String nome, String descricao, LocalDateTime tempoInicio, LocalDateTime tempoFim, Local local) {
        super(evento_id, nome, descricao, tempoInicio, tempoFim, local);
        palestrantes = new ArrayList<>();
    }

    public void adicionaPalestrante(Palestrante palestrante) {
        palestrantes.add(palestrante);
    }

    public void printaPalestra() {
        printaEvento();
        System.out.println(palestrantes.get(0).getNome());
    }

}
