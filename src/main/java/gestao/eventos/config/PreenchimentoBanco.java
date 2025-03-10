package gestao.eventos.config;

import gestao.eventos.entidades.Local;
import gestao.eventos.entidades.eventos.*;
import gestao.eventos.entidades.pessoas.*;
import gestao.eventos.entidades.pessoas.Musico;

import java.time.LocalDateTime;

public class PreenchimentoBanco {
    public static void preenche(BancoDeDados banco) {

        // classe que preenche as entidades para fazer testes e mostrar exemplos

        // PESSOA
//        Pessoa pessoa_1 = new Participante("nomePessoa", "doc", "wer");
//        banco.adicionaPessoa(pessoa_1);

        // PARTICIPANTE
        Participante participante_1 = new Participante("nomeParticipante", "doc", "wer");
        banco.adicionaParticipante(participante_1);

        // PALESTRANTE
        Palestrante palestrante_1 = new Palestrante("nomePalestrante", "doc", "tel");
        banco.adicionaPalestrante(palestrante_1);

        // MUSICO
        Musico musico_1 = new Musico("nomeMusico", "doc", "tel");
        banco.adicionaMusico(musico_1);

        // LOCAL
        Local local_1 = new Local("nomeLocal", "rua", "bairro", "cep", "cid", "est", palestrante_1);
        banco.adicionaLocal(local_1);

        // DATA E HORA (palestra)
        LocalDateTime time_1 = LocalDateTime.of(2025, 3, 8, 12, 0);
        LocalDateTime time_2 = LocalDateTime.of(2025, 3, 1, 13, 0);

        // PALESTRA
        Palestra palestra_1 = new Palestra("011", "nomePalestra", "desc", time_1, time_2, local_1);
        palestra_1.adicionaApresentador("doc");
        palestra_1.adicionaParticipante("doc");
//        palestra_1.adicionaParticipante("doc");
//        palestra_1.adicionaParticipante("doc");
        banco.adicionaPalestra(palestra_1.getEventoId(), palestra_1);

        // SHOW MUSICAL
        ShowMusical musical_1 = new ShowMusical("012", "nomeMusical", "desc", time_1, time_2, local_1);
        musical_1.adicionaApresentador("doc");
        musical_1.adicionaParticipante("doc");
        banco.adicionaShowMusical(musical_1.getEventoId(), musical_1);

//        System.out.println(palestra_1.getStatusEvento());
//        palestra_1.checaStatusEvento();
//        System.out.println(palestra_1.getStatusEvento());
//        palestra_1.printaAtributos();
//        participante_1.printaAtributos();
//        palestrante_1.printaAtributos();
//        local_1.printaAtributos();
    }
}
