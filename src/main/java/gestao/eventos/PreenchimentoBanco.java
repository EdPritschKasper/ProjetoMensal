package gestao.eventos;

import gestao.eventos.entidades.Local;
import gestao.eventos.entidades.eventos.*;
import gestao.eventos.entidades.pessoas.*;
import gestao.eventos.entidades.pessoas.Musico;

import java.time.LocalDateTime;

public class PreenchimentoBanco {
    public static void preenche(BancoDeDados banco) {

        // classe que preenche as entidades para fazer testes e mostrar exemplos

        // PESSOA
        Pessoa pessoa_1 = new Participante("nomePessoa", "doc", "wer", "sdf");
        banco.adicionaPessoa(pessoa_1);

        // PARTICIPANTE
        Participante participante_1 = new Participante("nomeParticipante", "doc", "wer", "sdf");
        banco.adicionaParticipante(participante_1);

        // PALESTRANTE
        Palestrante palestrante_1 = new Palestrante("nomePalestrante", "doc", "tel", "cont");
        banco.adicionaPalestrante(palestrante_1);

        // MUSICO
        Musico musico_1 = new Musico("nomeMusico", "doc", "tel");
        banco.adicionaMusico(musico_1);

        // LOCAL
        Local local_1 = new Local("nomeLocal", "rua", "bairro", "cep", "cid", "est", palestrante_1);
        banco.adicionaLocal(local_1);

        // DATA E HORA (palestra)
        LocalDateTime time_1 = LocalDateTime.of(2025, 3, 1, 12, 0);
        LocalDateTime time_2 = LocalDateTime.of(2025, 3, 1, 13, 0);

        // PALESTRA
        Palestra palestra_1 = new Palestra("011", "nomePalestra", "desc", time_1, time_2, local_1);
        palestra_1.adicionaPalestrante("doc");
        palestra_1.adicionaParticipante("doc");
        banco.adicionaPalestra(palestra_1.getEventoId(), palestra_1);

        // SHOW MUSICAL
        ShowMusical musical_1 = new ShowMusical("012", "nomeMusical", "desc", time_1, time_2, local_1);
        musical_1.adicionaMusico("doc");
        musical_1.adicionaParticipante("doc");
        banco.adicionaShowMusical(musical_1.getEventoId(), musical_1);

        // printa um evento para exemplo
//        palestra_1.printaPalestra();
//        musical_1.printaMusical();
    }

}
