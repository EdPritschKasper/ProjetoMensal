package gestao.eventos.opcoes.cadastro;

import java.util.Scanner;
import gestao.eventos.entidades.pessoas.Participante;
import gestao.eventos.config.*;
import gestao.eventos.opcoes.Opcao;

public class CadastraParticipante extends Opcao {
    private static CadastraParticipante instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static CadastraParticipante getInstancia(){
        if(instancia == null) {
            instancia = new CadastraParticipante();
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
        System.out.println("Insira o telefone");
        String telefone = scanner.nextLine();

        Participante participante = new Participante(nome, documento, telefone);
        bancoDeDados.adicionaParticipante(participante);
    }
}
