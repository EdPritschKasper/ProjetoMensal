package gestao.eventos.opcoes.cadastro;

import java.util.Scanner;
import gestao.eventos.entidades.pessoas.Palestrante;
import gestao.eventos.config.*;
import gestao.eventos.opcoes.Opcao;

public class CadastraPalestrante extends Opcao {
    private static CadastraPalestrante instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static CadastraPalestrante getInstancia(){
        if(instancia == null) {
            instancia = new CadastraPalestrante();
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

        Palestrante palestrante = new Palestrante(nome, documento, telefone);
        bancoDeDados.adicionaPalestrante(palestrante);
    }
}
