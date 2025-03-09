package gestao.eventos.opcoes.altera;

import java.util.Scanner;
import gestao.eventos.entidades.pessoas.Palestrante;
import gestao.eventos.config.*;
import gestao.eventos.opcoes.Opcao;

public class AlteraPalestrante extends Opcao {
    private static AlteraPalestrante instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static AlteraPalestrante getInstancia(){
        if(instancia == null) {
            instancia = new AlteraPalestrante();
        }
        return instancia;
    }

    public void executaOpcao(){

        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        System.out.println("Insira o documento do Palestrante: ");
        Palestrante palestrante = bancoDeDados.getPalestrante(scanner.nextLine());
        String documento = palestrante.getDocumento();

        System.out.println("Altere o nome: ");
        System.out.println("Nome atual: " + palestrante.getNome());
        palestrante.setNome(scanner.nextLine());
        System.out.println("Altere o documento: ");
        System.out.println("Documento atual: " + palestrante.getDocumento());
        palestrante.setDocumento(scanner.nextLine());
        System.out.println("Altere o telefone: ");
        System.out.println("Telefone atual: " + palestrante.getTelefone());
        palestrante.setTelefone(scanner.nextLine());

        bancoDeDados.alteraPalestrante(documento, palestrante);
    }
}
