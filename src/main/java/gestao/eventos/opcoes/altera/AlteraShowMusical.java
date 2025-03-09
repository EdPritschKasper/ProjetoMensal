package gestao.eventos.opcoes.altera;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.VariaveisGlobais;
import gestao.eventos.entidades.eventos.ShowMusical;
import gestao.eventos.opcoes.Opcao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlteraShowMusical extends Opcao {
    private static AlteraShowMusical instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static AlteraShowMusical getInstancia(){
        if(instancia == null) {
            instancia = new AlteraShowMusical();
        }
        return instancia;
    }

    public void executaOpcao(){
        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        System.out.println("Insira o id do ShowMusical: ");
        ShowMusical showMusical = bancoDeDados.getShowMusical(scanner.nextLine());
        String id = showMusical.getEventoId();

        System.out.println("Altere o nome: ");
        System.out.println("Nome Atual: " + showMusical.getNome());
        showMusical.setNome(scanner.nextLine());
        System.out.println("Altere o id : ");
        System.out.println("Id Atual: " + showMusical.getEventoId());
        showMusical.setEventoId(scanner.nextLine());
        System.out.println("Altere a descricao : ");
        System.out.println("Descricao Atual: " + showMusical.getDescricao());
        showMusical.setDescricao(scanner.nextLine());
        System.out.println("Altere o tempo de inicio : "); //2025-03-06T14:30:00
        System.out.println("Inicio Atual: " + showMusical.getTempoInicio());
        showMusical.setTempoInicio(LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("Altere o tempo de fim : ");
        System.out.println("Fim Atual: " + showMusical.getTempoFim());
        showMusical.setTempoFim(LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("Insira o nome do local : ");
        System.out.println("Nome Atual: " + showMusical.getLocal().getNome());
        showMusical.setLocal(scanner.nextLine());

        bancoDeDados.alteraShowMusical(id, showMusical);
    }
}
