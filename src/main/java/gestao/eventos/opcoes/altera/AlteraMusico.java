package gestao.eventos.opcoes.altera;

import java.util.Scanner;
import gestao.eventos.entidades.pessoas.Musico;
import gestao.eventos.config.*;
import gestao.eventos.opcoes.Opcao;

public class AlteraMusico extends Opcao {
    private static AlteraMusico instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static AlteraMusico getInstancia(){
        if(instancia == null) {
            instancia = new AlteraMusico();
        }
        return instancia;
    }

    public void executaOpcao(){

        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        System.out.println("Insira o documento do Musico: ");
        Musico musico = bancoDeDados.getMusico(scanner.nextLine());
        String documento = musico.getDocumento();

        System.out.println("Altere o nome: ");
        System.out.println("Nome atual: " + musico.getNome());
        musico.setNome(scanner.nextLine());
        System.out.println("Altere o documento: ");
        System.out.println("Documento atual: " + musico.getDocumento());
        musico.setDocumento(scanner.nextLine());
        System.out.println("Altere o telefone: ");
        System.out.println("Telefone atual: " + musico.getTelefone());
        musico.setTelefone(scanner.nextLine());

        bancoDeDados.alteraMusico(documento, musico);
    }
}
