package gestao.eventos.opcoes.cadastro;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.VariaveisGlobais;
import gestao.eventos.entidades.eventos.ShowMusical;
import gestao.eventos.opcoes.Opcao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastraShowMusical extends Opcao {
    private static CadastraShowMusical instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static CadastraShowMusical getInstancia(){
        if(instancia == null) {
            instancia = new CadastraShowMusical();
        }
        return instancia;
    }

    // metodo concreto de IOpcao
    public void executaOpcao(){

        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        int opcaoShow = 0;

        ShowMusical showMusical = new ShowMusical();
        System.out.println("Insira o nome do Show Musical : ");
        showMusical.setNome(scanner.nextLine());
        System.out.println("Insira o id : ");
        showMusical.setEventoId(scanner.nextLine());
        System.out.println("Insira a descricao : ");
        showMusical.setDescricao(scanner.nextLine());
        System.out.println("Insira o tempo de inicio : "); //2025-03-06T14:30:00
        showMusical.setTempoInicio(LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("Insira o tempo de fim : ");
        showMusical.setTempoFim(LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("Insira o nome do local : ");
        showMusical.setLocal(scanner.nextLine());
        System.out.println("Insira agora os participantes e Musicos : ");

        do{
            System.out.println("1 - Adicionar um Participante: ");
            System.out.println("2 - Adicionar um Musico: ");
            System.out.println("0 - Encerrar cadastro de evento: ");
            opcaoShow = scanner.nextInt();
            scanner.nextLine();

            switch(opcaoShow) {
                case 1:
                    System.out.println("Digite o documento do Participante ");
                    showMusical.adicionaParticipante(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Digite o documento do Musico ");
                    showMusical.adicionaApresentador(scanner.nextLine());
                    break;
                case 0:
                    break;
            }

        } while(opcaoShow != 0);

        bancoDeDados.adicionaShowMusical(showMusical.getEventoId(), showMusical);
    }
}
