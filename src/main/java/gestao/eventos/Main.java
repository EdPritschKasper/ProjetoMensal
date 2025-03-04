package gestao.eventos;

import gestao.eventos.entidades.pessoas.Palestrante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BancoDeDados banco = BancoDeDados.getInstancia();
        int opção;


        PreenchimentoBanco.preenche(banco); // preenche as classes para exemplificar o sistema

        do {
            //Adicionar o resto dos Cases quando terminarmos o resto
            System.out.println("Qual a operação desejada");
            System.out.println("1. Cadastrar Paletrante");
            System.out.println("2. Cadastrar Participante");
            System.out.println("3. Cadastrar Local");
            System.out.println("4. Cadastrar Evento");
            System.out.println("0. Encerrar o Programa");

            System.out.println("Opção: ");
            opção = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do scanner para nao pular linha

            switch (opção){

                case 1:{
                    System.out.println("Qual o nome do palestrante ? : ");
                    String nome = scanner.nextLine();
                    System.out.println("Qual o documento ? : ");
                    String documento = scanner.nextLine();
                    System.out.println("Qual o telefone do palestrante");
                    String telefone = scanner.nextLine();
                    System.out.println("Qual o Conteudo da Palestra ?");
                    String conteudoPalestra = scanner.nextLine();
                    Palestrante conteudo = new Palestrante(nome , documento , telefone , conteudoPalestra);
                    break;
                }
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Encerrando o programa");
                    break;
            }
        } while(opção != 0);
    }
}