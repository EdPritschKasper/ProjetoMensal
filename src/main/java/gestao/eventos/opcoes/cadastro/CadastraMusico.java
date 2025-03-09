package gestao.eventos.opcoes.cadastro;

import java.util.Scanner;
import gestao.eventos.entidades.pessoas.Musico;
import gestao.eventos.config.*;
import gestao.eventos.opcoes.Opcao;

public class CadastraMusico extends Opcao {
    private static CadastraMusico instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static CadastraMusico getInstancia(){
        if(instancia == null) {
            instancia = new CadastraMusico();
        }
        return instancia;
    }

    public void executaOpcao(){
        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        System.out.println("Insira o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Insira o documento: ");
        String documento = scanner.nextLine();
        System.out.println("Insira o telefone: ");
        String telefone = scanner.nextLine();

        Musico musico = new Musico(nome, documento, telefone);
        bancoDeDados.adicionaMusico(musico);
    }
}
