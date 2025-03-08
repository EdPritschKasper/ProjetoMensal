package gestao.eventos.opcoes.cases;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.VariaveisGlobais;
import gestao.eventos.opcoes.Opcao;
import gestao.eventos.opcoes.ControleOpcoes;

import java.util.Scanner;

public class CaseRemove extends Opcao {
    private static CaseRemove instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static CaseRemove getInstancia(){
        if(instancia == null) {
            instancia = new CaseRemove();
        }
        return instancia;
    }

    public void executaOpcao(){
        int opcao = 0;
        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        ControleOpcoes controleOpcoes = ControleOpcoes.getInstancia();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        do {
            System.out.println("Digite a opção para Remover: ");
            System.out.println("1 - Participante");
            System.out.println("2 - Palestrante");
            System.out.println("3 - Musico");
            System.out.println("4 - Local");
            System.out.println("5 - Palestra");
            System.out.println("6 - Show Musical");
            System.out.println("0 - Sair do remover");

            System.out.println("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do scanner para nao pular linha

            switch (opcao) {
                case 1:// Remove Participante
                    System.out.println("Digite o documento do Participante");
                    String documento = scanner.nextLine();
                    String resultado = bancoDeDados.removeParticipante(documento) ? "Participante removido com sucesso" : "Participante não encontrado";
                    System.out.println(resultado);
                    break;
                case 0:// Sair da Opção de Exibir
                    System.out.println("Saindo do exibir");
                    break;
                default:// Opção Inválida
                    System.out.println("Opção inválida");
                    break;
            }
        } while(opcao != 0);
    }
}
