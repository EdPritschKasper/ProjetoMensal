package gestao.eventos;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.PreenchimentoBanco;
import gestao.eventos.opcoes.ControleOpcoes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BancoDeDados banco = BancoDeDados.getInstancia();
        PreenchimentoBanco.preenche(banco); // preenche as classes para exemplificar o sistema
        ControleOpcoes controleOpcoes = ControleOpcoes.getInstancia(); // gerencia as opcoes do sistema
        int opcao;

        // do while inicial
        do {
            System.out.println("Digite o número da operação desejada: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Exibir");
            System.out.println("3 - Remover");
            System.out.println("4 - Alterar");


            System.out.println("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do scanner para nao pular linha

            // switch inicial
            switch (opcao){

                case 1:// Opção de Cadastro
                    controleOpcoes.getOpcao("case cadastra").executaOpcao();
                    break;
                case 2:// Opção de Exibir
                    controleOpcoes.getOpcao("case exibe").executaOpcao();
                    break;
                case 3:// Opção de Remover
                    controleOpcoes.getOpcao("case remove").executaOpcao();
                    break;
                case 4: // Opção de Alterar
                    controleOpcoes.getOpcao("case altera").executaOpcao();
                    break;
                case 0:
                    System.out.println("Encerrando o programa");
                    break;
            }
        } while(opcao != 0);
    }
}