package gestao.eventos;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.PreenchimentoBanco;
import gestao.eventos.entidades.eventos.*;
import gestao.eventos.entidades.*;
import gestao.eventos.opcoes.ControleOpcoes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BancoDeDados banco = BancoDeDados.getInstancia();
        PreenchimentoBanco.preenche(banco); // preenche as classes para exemplificar o sistema
        ControleOpcoes controleOpcoes = ControleOpcoes.getInstancia(); // gerencia as opcoes do sistema
        int opção;

        do {
            //Adicionar o resto dos Cases quando terminarmos o resto
            System.out.println("Qual a operação desejada");
            System.out.println("1. Cadastrar Participante");
            System.out.println("2. Cadastrar Palestrante");
            System.out.println("3. Cadastrar Musico");
            System.out.println("4. Cadastrar Local");
            System.out.println("5. Cadastrar Palestra");
            System.out.println("6. Cadastrar Show Musical");
            System.out.println("7. Exibir Participantes");
            System.out.println("8. Exibir Palestrantes");
            System.out.println("9. Exibir Musicos");
            System.out.println("10. Exibir Locais");
            System.out.println("11. Exibir Palestras");
            System.out.println("12. Exibir Show Musicais");
            System.out.println("13. Deletar Participante");
            System.out.println("14. Deletar Palestra");
            System.out.println("15. Alterar Participante");
            System.out.println("16. Alterar Palestra");
            System.out.println("0. Encerrar o Programa");

            System.out.println("Opção: ");
            opção = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do scanner para nao pular linha

            switch (opção){

                case 1:{

                    break;
                }
                case 2:
                    controleOpcoes.getOpcao("cadastra palestrante").executaOpcao();
                    break;
                case 3:
                    break;
                case 4: // CADASTRA LOCAL
                    controleOpcoes.getOpcao("cadastra local").executaOpcao();
                    break;
                case 5: //CADASTRA PALESTRA
                    controleOpcoes.getOpcao("cadastra palestra").executaOpcao();
                    break;
                case 7: //CADASTRA SHOW MUSICAL
                    controleOpcoes.getOpcao("cadastra show musical").executaOpcao();
                    break;
                case 0:
                    System.out.println("Encerrando o programa");
                    break;
            }
        } while(opção != 0);
    }
}