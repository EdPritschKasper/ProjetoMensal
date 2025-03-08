package gestao.eventos.opcoes.cadastro;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.VariaveisGlobais;
import gestao.eventos.entidades.eventos.Palestra;
import gestao.eventos.opcoes.Opcao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastraPalestra extends Opcao {
    private static CadastraPalestra instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static CadastraPalestra getInstancia(){
        if(instancia == null) {
            instancia = new CadastraPalestra();
        }
        return instancia;
    }

    public void executaOpcao(){
        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        int opcaoPalestra = 0;

        Palestra palestra = new Palestra();
        System.out.println("Insira o nome da Palestra : ");
        palestra.setNome(scanner.nextLine());
        System.out.println("Insira o id : ");
        palestra.setEventoId(scanner.nextLine());
        System.out.println("Insira a descricao : ");
        palestra.setDescricao(scanner.nextLine());
        System.out.println("Insira o tempo de inicio : "); //2025-03-06T14:30:00
        palestra.setTempoInicio(LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("Insira o tempo de fim : ");
        palestra.setTempoFim(LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("Insira o nome do local : ");
        palestra.setLocal(scanner.nextLine());
        System.out.println("Insira agora os participantes e Palestrantes : ");

        do{
            System.out.println("1 - Adicionar um Participante: ");
            System.out.println("2 - Adicionar um Palestrante: ");
            System.out.println("0 - Encerrar cadastro de evento: ");
            opcaoPalestra = scanner.nextInt();
            scanner.nextLine();

            switch(opcaoPalestra) {
                case 1:
                    System.out.println("Digite o documento do Participante ");
                    palestra.adicionaParticipante(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Digite o documento do Palestrante ");
                    palestra.adicionaApresentador(scanner.nextLine());
                    break;
                case 0:
                    break;
            }

        } while(opcaoPalestra != 0);

        bancoDeDados.adicionaPalestra(palestra.getEventoId(), palestra);
    }
}
