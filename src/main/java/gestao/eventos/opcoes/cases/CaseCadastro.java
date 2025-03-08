package gestao.eventos.opcoes.cases;

import gestao.eventos.config.VariaveisGlobais;
import gestao.eventos.opcoes.Opcao;
import gestao.eventos.opcoes.ControleOpcoes;

import java.util.Scanner;

public class CaseCadastro extends Opcao {
    private static CaseCadastro instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static CaseCadastro getInstancia(){
        if(instancia == null) {
            instancia = new CaseCadastro();
        }
        return instancia;
    }

    public void executaOpcao(){
        int opcao = 0;
        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        ControleOpcoes controleOpcoes = ControleOpcoes.getInstancia();

        do {
            System.out.println("Digite a opção para CADASTRAR: ");
            System.out.println("1 - Participante");
            System.out.println("2 - Palestrante");
            System.out.println("3 - Musico");
            System.out.println("4 - Local");
            System.out.println("5 - Palestra");
            System.out.println("6 - Show Musical");
            System.out.println("0 - Sair do cadastro");

            System.out.println("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do scanner para nao pular linha

            switch (opcao) {
                case 1: // Cadastra Participante
                    System.out.println("cadastra participante");
                    break;
                case 2:// Cadastra Palestrante
                    controleOpcoes.getOpcao("cadastra palestrante").executaOpcao();
                    break;
                case 3:// Cadastra Músico
                    System.out.println("cadastra musico");
                    break;
                case 4:// Cadastra Local
                    controleOpcoes.getOpcao("cadastra local").executaOpcao();
                    break;
                case 5:// Cadastra Palestra
                    controleOpcoes.getOpcao("cadastra palestra").executaOpcao();
                    break;
                case 6:// Cadastra Show Musical
                    controleOpcoes.getOpcao("cadastra show musical").executaOpcao();
                    break;
                case 0:// Sair da Opção de Cadastro
                    System.out.println("Saindo do cadastro");
                    break;
                default:// Opção Inválida
                    System.out.println("Opção inválida");
                    break;
            }
        } while(opcao != 0);
    }
}
