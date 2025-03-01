package SistemaDeGestãoDeEventos;

import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BancoDeDados banco = new BancoDeDados();

         //apenas teste do Evento
//        LocalDateTime time1 = LocalDateTime.of(2025, 3, 1, 12, 0);
//        LocalDateTime time2 = LocalDateTime.of(2025, 3, 1, 13, 0);
//        Palestrante palestrante_1 = new Palestrante("nome", "doc", "tel", "cont");
//        Participantes participantes_1 = new Participantes("nome", "doc", "wer", "sdf");
//        Evento evento_1 = new Evento("011", "nome", "desc", time1, time2, new Local());
//        evento_1.adicionaPalestrante(palestrante_1);
//        evento_1.adicionaParticipante(participantes_1);
//        evento_1.getEvento();

        while (true){
            //Adicionar o resto dos Cases quando terminarmos o resto
            System.out.println("Qual a operação desejada");
            System.out.println("1. Cadastrar Paletrante");
            System.out.println("2. Cadastrar Participante");


            System.out.println("Opção: ");
            int opção = scanner.nextInt();

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
                }

            }
        }
    }
}