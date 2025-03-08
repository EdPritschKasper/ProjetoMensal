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
        int opção;

        PreenchimentoBanco.preenche(banco); // preenche as classes para exemplificar o sistema
        ControleOpcoes controleOpcoes = ControleOpcoes.getInstancia();

        do {
            //Adicionar o resto dos Cases quando terminarmos o resto
            // CADASTROS
            System.out.println("Qual a operação desejada");
            System.out.println("1 - Cadastrar Palestrante");
            System.out.println("1 Cadastrar Participante");
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
                    controleOpcoes.getOpcao("cadastra palestrante").executaOpcao();
                    break;
                }
                case 2:
                    break;
                case 3:
                    break;
                case 4: // CADASTRA LOCAL
                    Local local = new Local();
                    System.out.println("Insira o nome do local : ");
                    local.setNome(scanner.nextLine());
                    System.out.println("Insira a rua : ");
                    local.setRua(scanner.nextLine());
                    System.out.println("Insira bairro : ");
                    local.setBairro(scanner.nextLine());
                    System.out.println("Insira cep : ");
                    local.setCep(scanner.nextLine());
                    System.out.println("Insira a cidade : ");
                    local.setCidade(scanner.nextLine());
                    System.out.println("Insira o estado : ");
                    local.setEstado(scanner.nextLine());
                    System.out.println("Insira o documento da Pessoa : ");
                    local.setPessoa(scanner.nextLine());
                    banco.adicionaLocal(local);
                    break;
                case 5: //CADASTRA PALESTRA
                    int opcaoPalestra = 0;

                    Palestra palestra = new Palestra();
                    System.out.println("Insira o nome da Palestra : ");
                    palestra.setNome(scanner.nextLine());
                    System.out.println("Insira o id : ");
                    palestra.setEventoId(scanner.nextLine());
                    System.out.println("Insira a descricao : ");
                    palestra.setDescricao(scanner.nextLine());
                    System.out.println("Insira o tempo de inicio : "); //2025-03-06T14:30:00
                    palestra.setTempoInicio(LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
                    System.out.println("Insira o tempo de fim : ");
                    palestra.setTempoFim(LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
                    System.out.println("Insira o nome do local : ");
                    palestra.setLocal(scanner.nextLine());
                    System.out.println("Insira agora os participantes e Palestrantes : ");

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

                    banco.adicionaPalestra(palestra.getEventoId(), palestra);
                    break;
                case 7: //CADASTRA SHOW MUSICAL
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

                    banco.adicionaShowMusical(showMusical.getEventoId(), showMusical);
                    break;
                case 0:
                    System.out.println("Encerrando o programa");
                    break;
            }
        } while(opção != 0);
    }
}