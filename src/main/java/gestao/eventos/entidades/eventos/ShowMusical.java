package gestao.eventos.entidades.eventos;

import gestao.eventos.BancoDeDados;
import gestao.eventos.StatusEvento;
import gestao.eventos.entidades.Local;
import gestao.eventos.entidades.pessoas.Musico;
import gestao.eventos.interfaces.IChecaEvento;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.ArrayList;

public class ShowMusical extends Evento implements IChecaEvento {
    private List<Musico> musicos;

    public ShowMusical(String eventoId, String nome, String descricao, LocalDateTime tempoInicio, LocalDateTime tempoFim, Local local){
        super(eventoId, nome, descricao, tempoInicio, tempoFim, local);
        musicos = new ArrayList<>();
    }

    public ShowMusical(){
        super();
        musicos = new ArrayList<>();
    }

    // implementacao de metodo abstrado
    public void adicionaApresentador(String documento) {
        BancoDeDados banco = BancoDeDados.getInstancia();
        musicos.add(banco.getMusico(documento));
    }

    // metodo interface IChecaEvento
    public void checaStatusEvento(){
        long diasAteInicio = ChronoUnit.DAYS.between(
                LocalDateTime.now().toLocalDate(),
                this.tempoInicio.toLocalDate()
        );
        if(diasAteInicio <= 15 && participantes.size() <= 10) {
            setStatusEvento(StatusEvento.CANCELADO);
        } else {
            setStatusEvento(StatusEvento.CONFIRMADO);
        }
    }
}
