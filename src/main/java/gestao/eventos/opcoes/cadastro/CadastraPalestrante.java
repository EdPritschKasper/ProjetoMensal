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

        System.out.println("Qual o nome do palestrante ? : ");
        String nome = scanner.nextLine();
        System.out.println("Qual o documento ? : ");
        String documento = scanner.nextLine();
        System.out.println("Qual o telefone do palestrante");
        String telefone = scanner.nextLine();
        System.out.println("Qual o Conteudo da Palestra ?");
        String conteudoPalestra = scanner.nextLine();

        Palestrante palestrante = new Palestrante(nome , documento , telefone , conteudoPalestra);
        bancoDeDados.adicionaPalestrante(palestrante);
    }
}
