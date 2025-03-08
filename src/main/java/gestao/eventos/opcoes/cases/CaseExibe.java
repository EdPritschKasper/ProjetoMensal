package gestao.eventos.opcoes.cases;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.VariaveisGlobais;
import gestao.eventos.opcoes.Opcao;
import gestao.eventos.opcoes.ControleOpcoes;

import java.util.Scanner;

public class CaseExibe extends Opcao {
    private static CaseExibe instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static CaseExibe getInstancia(){
        if(instancia == null) {
            instancia = new CaseExibe();
        }
        return instancia;
    }

    public void executaOpcao(){
        int opcao = 0;
        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        ControleOpcoes controleOpcoes = ControleOpcoes.getInstancia();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        do {
            System.out.println("Digite a opção para Exibir: ");
            System.out.println("1 - Participante");
            System.out.println("2 - Palestrante");
            System.out.println("3 - Musico");
            System.out.println("4 - Local");
            System.out.println("5 - Palestra");
            System.out.println("6 - Show Musical");
            System.out.println("0 - Sair do exibir");

            System.out.println("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do scanner para nao pular linha

            switch (opcao) {
                case 1:// Exibe Todos os Participantes
                    bancoDeDados.printaAllParticipantes();
                    break;
                case 2:// Exibe Todos os Palestrantes
                    bancoDeDados.printaAllPalestrantes();
                    break;
                case 3:// Exibe Todos os Musicos
                    bancoDeDados.printaAllMusicos();
                    break;
                case 4:// Exibe Todos os Locais
                    bancoDeDados.printaAllLocais();
                    break;
                case 5:// Exibe Todas as Palestras
                    bancoDeDados.printaAllPalestras();
                    break;
                case 6:// Exibe Todos os Shows Musicais
                    bancoDeDados.printaAllShowsMusicais();
                    break;
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
