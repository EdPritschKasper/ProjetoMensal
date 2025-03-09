package gestao.eventos.opcoes.altera;

import java.util.Scanner;
import gestao.eventos.entidades.pessoas.Participante;
import gestao.eventos.config.*;
import gestao.eventos.opcoes.Opcao;

public class AlteraParticipante extends Opcao {
    private static AlteraParticipante instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static AlteraParticipante getInstancia(){
        if(instancia == null) {
            instancia = new AlteraParticipante();
        }
        return instancia;
    }

    public void executaOpcao(){

        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        System.out.println("Insira o documento do Participante: ");
        Participante participante = bancoDeDados.getParticipante(scanner.nextLine());
        String documento = participante.getDocumento();

        System.out.println("Altere o nome: ");
        System.out.println("Nome atual: " + participante.getNome());
        participante.setNome(scanner.nextLine());
        System.out.println("Altere o documento: ");
        System.out.println("Documento atual: " + participante.getDocumento());
        participante.setDocumento(scanner.nextLine());
        System.out.println("Altere o telefone: ");
        System.out.println("Telefone atual: " + participante.getTelefone());
        participante.setTelefone(scanner.nextLine());

        bancoDeDados.alteraParticipante(documento, participante);
    }
}
