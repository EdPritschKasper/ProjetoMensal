package gestao.eventos.opcoes.altera;

import gestao.eventos.config.BancoDeDados;
import gestao.eventos.config.VariaveisGlobais;
import gestao.eventos.entidades.Local;
import gestao.eventos.opcoes.Opcao;

import java.util.Scanner;

public class AlteraLocal extends Opcao {
    private static AlteraLocal instancia;

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static AlteraLocal getInstancia(){
        if(instancia == null) {
            instancia = new AlteraLocal();
        }
        return instancia;
    }

    public void executaOpcao(){
        Scanner scanner = VariaveisGlobais.getInstancia().getScanner();
        BancoDeDados bancoDeDados = BancoDeDados.getInstancia();

        System.out.println("Insira o nome do local: ");
        Local local = bancoDeDados.getLocal(scanner.nextLine());
        String nomeLocal = local.getNome();

        System.out.println("Altere o nome do local: ");
        System.out.println("Nome atual: " + local.getNome());
        local.setNome(scanner.nextLine());
        System.out.println("Altere a rua : ");
        System.out.println("Rua atual: " + local.getRua());
        local.setRua(scanner.nextLine());
        System.out.println("Altere bairro : ");
        System.out.println("Rua atual: " + local.getBairro());
        local.setBairro(scanner.nextLine());
        System.out.println("Altere cep : ");
        System.out.println("Cep atual: " + local.getCep());
        local.setCep(scanner.nextLine());
        System.out.println("Altere a cidade : ");
        System.out.println("Cidade atual: " + local.getCidade());
        local.setCidade(scanner.nextLine());
        System.out.println("Altere o estado : ");
        System.out.println("Estado atual: " + local.getEstado());
        local.setEstado(scanner.nextLine());
        System.out.println("Altere o documento da Pessoa : ");
        System.out.println("Documento da pessoa atual: " + local.getPessoa().getDocumento());
        local.setPessoa(scanner.nextLine());

        bancoDeDados.alteraLocal(nomeLocal, local);
    }
}
