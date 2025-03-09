package gestao.eventos.opcoes.altera;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.VariaveisGlobais;
import gestao.eventos.entidades.eventos.Palestra;
import gestao.eventos.opcoes.Opcao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlteraPalestra extends Opcao {
    private static AlteraPalestra instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static AlteraPalestra getInstancia(){
        if(instancia == null) {
            instancia = new AlteraPalestra();
        }
        return instancia;
    }

    public void executaOpcao(){
        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        System.out.println("Insira o id da Palestra: ");
        Palestra palestra = bancoDeDados.getPalestra(scanner.nextLine());
        String id = palestra.getEventoId();

        System.out.println("Altere o nome: ");
        System.out.println("Nome Atual: " + palestra.getNome());
        palestra.setNome(scanner.nextLine());
        System.out.println("Altere o id : ");
        System.out.println("Id Atual: " + palestra.getEventoId());
        palestra.setEventoId(scanner.nextLine());
        System.out.println("Altere a descricao : ");
        System.out.println("Descricao Atual: " + palestra.getDescricao());
        palestra.setDescricao(scanner.nextLine());
        System.out.println("Altere o tempo de inicio : "); //2025-03-06T14:30:00
        System.out.println("Inicio Atual: " + palestra.getTempoInicio());
        palestra.setTempoInicio(LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("Altere o tempo de fim : ");
        System.out.println("Fim Atual: " + palestra.getTempoFim());
        palestra.setTempoFim(LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("Insira o nome do local : ");
        System.out.println("Nome Atual: " + palestra.getLocal().getNome());
        palestra.setLocal(scanner.nextLine());

        bancoDeDados.alteraPalestra(id, palestra);
    }
}
