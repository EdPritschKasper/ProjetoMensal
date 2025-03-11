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
        Pessoa pessoa_1 = new Participante("nomePessoa", "doc", "wer");
        banco.adicionaPessoa(pessoa_1);

        // PARTICIPANTE
        Participante participante_1 = new Participante("Rodrigo", "965.115.388.12", "(40) 985865255");
        banco.adicionaParticipante(participante_1);

        Participante participante_2 = new Participante("Nilce", "065.915.332.48", "(50) 956778931");
        banco.adicionaParticipante(participante_2);

        // PALESTRANTE
        Palestrante palestrante_1 = new Palestrante("Adalberto", "801.772.897.90", "(78) 984625471");
        banco.adicionaPalestrante(palestrante_1);

        Palestrante palestrante_2 = new Palestrante("Olivia", "209.752.591.42", "(78) 984625471");
        banco.adicionaPalestrante(palestrante_2);

        // MUSICO
        Musico musico_1 = new Musico("Robertinho", "777.897.918.80", "(95) 9037254721");
        banco.adicionaMusico(musico_1);

        // LOCAL
        Local local_1 = new Local("Charrua", "Cassiano Ricador", "Portes", "85865155", "Foz do iguaçu", "Paraná", palestrante_1);
        banco.adicionaLocal(local_1);

        // DATA E HORA (palestra)
        LocalDateTime time_1 = LocalDateTime.of(2025, 3, 8, 12, 0);
        LocalDateTime time_2 = LocalDateTime.of(2025, 3, 1, 13, 0);

        // PALESTRA
        Palestra palestra_1 = new Palestra("011", "nomePalestra", "desc", time_1, time_2, local_1);
        palestra_1.adicionaApresentador("801.772.897.90");
        palestra_1.adicionaParticipante("965.115.388.12");
        banco.adicionaPalestra(palestra_1.getEventoId(), palestra_1);

        // SHOW MUSICAL
        ShowMusical musical_1 = new ShowMusical("012", "Rei leão", "desc", time_1, time_2, local_1);
        musical_1.adicionaApresentador("777.897.918.80");
        musical_1.adicionaParticipante("065.915.332.48");
        banco.adicionaShowMusical(musical_1.getEventoId(), musical_1);

    }
}
