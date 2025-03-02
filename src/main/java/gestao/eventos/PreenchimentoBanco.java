package gestao.eventos;

import gestao.eventos.entidades.Local;
import gestao.eventos.entidades.eventos.Palestra;
import gestao.eventos.entidades.eventos.ShowMusical;
import gestao.eventos.entidades.pessoas.Musico;
import gestao.eventos.entidades.pessoas.Palestrante;
import gestao.eventos.entidades.pessoas.Participante;

import java.time.LocalDateTime;

public class PreenchimentoBanco {
    public static void preenche() {

        // classe para que preenche as classes para fazer testes e mostrar exemplos

        // PARTICIPANTE
        Participante participante_1 = new Participante("nomeParticipante", "doc", "wer", "sdf");

        // PALESTRANTE
        Palestrante palestrante_1 = new Palestrante("nomePalestrante", "doc", "tel", "cont");

        // MUSICO
        Musico musico_1 = new Musico("nomeMusico", "doc", "tel");

        // LOCAL
        Local local_1 = new Local("nomeLocal", "rua", "bairro", "cep", "cid", "est", palestrante_1);

        // DATA E HORA
        LocalDateTime time_1 = LocalDateTime.of(2025, 3, 1, 12, 0);
        LocalDateTime time_2 = LocalDateTime.of(2025, 3, 1, 13, 0);

        // PALESTRA
        Palestra palestra_1 = new Palestra("011", "nomePalestra", "desc", time_1, time_2, local_1);
        palestra_1.adicionaPalestrante(palestrante_1);
        palestra_1.adicionaParticipante(participante_1);

        // SHOW MUSICAL
        ShowMusical musical_1 = new ShowMusical("012", "nomeMusical", "desc", time_1, time_2, local_1);
        musical_1.adicionaMusico(musico_1);
        musical_1.adicionaParticipante(participante_1);

        // printa um evento para exemplo
//        palestra_1.printaPalestra();
//        musical_1.printaMusical();
    }

}
