package gestao.eventos.opcoes.cases;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.VariaveisGlobais;
import gestao.eventos.entidades.eventos.ShowMusical;
import gestao.eventos.opcoes.Opcao;
import gestao.eventos.opcoes.ControleOpcoes;
import gestao.eventos.entidades.eventos.*;

import java.util.Scanner;

public class CaseOutros extends Opcao {
    private static CaseOutros instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static CaseOutros getInstancia(){
        if(instancia == null) {
            instancia = new CaseOutros();
        }
        return instancia;
    }

    public void executaOpcao(){
        int opcao = 0, opcaoPalestra = 0;
        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        ControleOpcoes controleOpcoes = ControleOpcoes.getInstancia();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();
        Palestra palestra = new Palestra();
        ShowMusical showMusical = new ShowMusical();

        do {
            System.out.println("Digite a opção: ");
            System.out.println("1 - Checar Status Palestra: ");
            System.out.println("2 - Checar Status Show Musical: ");
            System.out.println("3 - Adicionar Membros à Palestra: ");
            System.out.println("4 - Adicionar Membros ao Show Musical: ");
            System.out.println("0 - Sair do Menu Outros: ");

            System.out.println("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do scanner para nao pular linha

            switch (opcao) {
                case 1:// checa status palestra
                    System.out.println("Digite o ID da palestra: ");
                    palestra = bancoDeDados.getPalestra(scanner.nextLine());
                    palestra.checaStatusEvento();
                    System.out.println("Status Palestra: " + palestra.getStatusEvento());
                    break;
                case 2:// checa status show musical
                    System.out.println("Digite o ID do show musical: ");
                    showMusical = bancoDeDados.getShowMusical(scanner.nextLine());
                    showMusical.checaStatusEvento();
                    System.out.println("Status Show Musical: " + showMusical.getStatusEvento());
                    break;
                case 3: // adiciona membros da palestra
                    System.out.println("Digite o ID da palestra: ");
                    palestra = bancoDeDados.getPalestra(scanner.nextLine());

                    System.out.println("Insira os participantes e Palestrantes : ");

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
                case 0:// Sair da Opção de Exibir
                    System.out.println("Saindo do exibir");
                    break;
                default:// Opção Inválida
                    System.out.println("Opção inválida");
                    break;
            }
        } while(opcao != 0);
    }
}
