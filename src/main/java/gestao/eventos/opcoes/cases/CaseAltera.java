package gestao.eventos.opcoes.cases;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.VariaveisGlobais;
import gestao.eventos.opcoes.Opcao;
import gestao.eventos.opcoes.ControleOpcoes;

import java.util.Scanner;

public class CaseAltera extends Opcao {
    private static CaseAltera instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static CaseAltera getInstancia(){
        if(instancia == null) {
            instancia = new CaseAltera();
        }
        return instancia;
    }

    public void executaOpcao(){
        int opcao = 0;
        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        ControleOpcoes controleOpcoes = ControleOpcoes.getInstancia();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        do {
            System.out.println("Digite a opção para Alterar: ");
            System.out.println("1 - Participante");
            System.out.println("2 - Palestrante");
            System.out.println("3 - Musico");
            System.out.println("4 - Local");
            System.out.println("5 - Palestra");
            System.out.println("6 - Show Musical");
            System.out.println("0 - Sair do Menu Alterar");

            System.out.println("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do scanner para nao pular linha

            switch (opcao) {
                case 1:
                    controleOpcoes.getOpcao("altera participante").executaOpcao();
                    break;
                case 2:
                    controleOpcoes.getOpcao("altera palestrante").executaOpcao();
                    break;
                case 3:
                    controleOpcoes.getOpcao("altera musico").executaOpcao();
                    break;
                case 4:
                    controleOpcoes.getOpcao("altera local").executaOpcao();
                    break;
                case 5:
                    controleOpcoes.getOpcao("altera palestra").executaOpcao();
                    break;
                case 6:
                    controleOpcoes.getOpcao("altera show musical").executaOpcao();
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
