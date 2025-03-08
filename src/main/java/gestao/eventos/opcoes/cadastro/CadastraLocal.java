package gestao.eventos.opcoes.cadastro;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.VariaveisGlobais;
import gestao.eventos.entidades.Local;
import gestao.eventos.opcoes.Opcao;

import java.util.Scanner;

public class CadastraLocal extends Opcao {
    private static CadastraLocal instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static CadastraLocal getInstancia(){
        if(instancia == null) {
            instancia = new CadastraLocal();
        }
        return instancia;
    }

    public void executaOpcao(){
        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        Local local = new Local();
        System.out.println("Insira o nome do local : ");
        local.setNome(scanner.nextLine());
        System.out.println("Insira a rua : ");
        local.setRua(scanner.nextLine());
        System.out.println("Insira bairro : ");
        local.setBairro(scanner.nextLine());
        System.out.println("Insira cep : ");
        local.setCep(scanner.nextLine());
        System.out.println("Insira a cidade : ");
        local.setCidade(scanner.nextLine());
        System.out.println("Insira o estado : ");
        local.setEstado(scanner.nextLine());
        System.out.println("Insira o documento da Pessoa : ");
        local.setPessoa(scanner.nextLine());

        bancoDeDados.adicionaLocal(local);
    }
}
