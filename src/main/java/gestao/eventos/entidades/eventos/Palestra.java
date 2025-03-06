package gestao.eventos.entidades.eventos;

import gestao.eventos.BancoDeDados;
import gestao.eventos.entidades.Local;
import gestao.eventos.entidades.pessoas.Palestrante;
import gestao.eventos.entidades.pessoas.Participante;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Palestra extends Evento{
    private List<Palestrante> palestrantes;

    public Palestra(String eventoId, String nome, String descricao, LocalDateTime tempoInicio, LocalDateTime tempoFim, Local local) {
        super(eventoId, nome, descricao, tempoInicio, tempoFim, local);
        palestrantes = new ArrayList<>();
    }

    public Palestra(){
        palestrantes = new ArrayList<>();
    }

    public void adicionaPalestrante(String documento) {
        BancoDeDados banco = BancoDeDados.getInstancia();
        palestrantes.add(banco.getPalestrante(documento));
    }


}
