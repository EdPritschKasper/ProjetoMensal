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

                case 1:{// Opcao de Cadastros
                    int opcaoCadastro = 0;

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
                        opcaoCadastro = scanner.nextInt();
                        scanner.nextLine(); // limpa o buffer do scanner para nao pular linha

                        switch (opcaoCadastro) {
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
                    } while(opcaoCadastro != 0);

                    break;
                }
                case 2:// Opção de Exibir
                    System.out.println("exibir");
                    break;
                case 3:// Opção de Remover
                    System.out.println("remover");
                    break;
                case 4: // Opção de Alterar
                    System.out.println("alterar");
                    break;
                case 0:
                    System.out.println("Encerrando o programa");
                    break;
            }
        } while(opcao != 0);
    }
}