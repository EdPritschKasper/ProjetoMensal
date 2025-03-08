package gestao.eventos.entidades.eventos;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.StatusEvento;
import gestao.eventos.entidades.Local;
import gestao.eventos.entidades.pessoas.Palestrante;
import gestao.eventos.interfaces.IChecaEvento;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Palestra extends Evento implements IChecaEvento {
    private List<Palestrante> palestrantes;

    public Palestra(String eventoId, String nome, String descricao, LocalDateTime tempoInicio, LocalDateTime tempoFim, Local local) {
        super(eventoId, nome, descricao, tempoInicio, tempoFim, local);
        palestrantes = new ArrayList<>();
    }

    public Palestra(){
        super();
        palestrantes = new ArrayList<>();
    }

    // implementacao de metodo abstrato
    public void adicionaApresentador(String documento) {
        BancoDeDados banco = BancoDeDados.getInstancia();
        palestrantes.add(banco.getPalestrante(documento));
    }

    // metodo interface IChecaEvento
    public void checaStatusEvento(){
        long diasAteInicio = ChronoUnit.DAYS.between(
                LocalDateTime.now().toLocalDate(),
                this.tempoInicio.toLocalDate()
        );
        if(diasAteInicio <= 10 && participantes.size() <= 7) {
            setStatusEvento(StatusEvento.CANCELADO);
        } else {
            setStatusEvento(StatusEvento.CONFIRMADO);
        }
    }
}
