package gestao.eventos.config;

import java.util.Scanner;

public class VariaveisGlobais {
    private static VariaveisGlobais instancia;
    private final Scanner scanner;

    private VariaveisGlobais() {
        scanner = new Scanner(System.in);
    }

    // obtem um unica instancia com metodo statico
    public static VariaveisGlobais getInstancia(){
        if(instancia == null) {
            instancia = new VariaveisGlobais();
        }
        return instancia;
    }

    public Scanner getScanner() {
        return this.scanner;
    }
}
