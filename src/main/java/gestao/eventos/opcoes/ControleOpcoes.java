package gestao.eventos.opcoes;

import java.util.HashMap;
import java.util.Map;

import gestao.eventos.opcoes.cadastro.*;
//import gestao.eventos.opcoes.exibe.*;
import gestao.eventos.opcoes.cases.CaseCadastro;
import gestao.eventos.opcoes.cases.CaseExibe;

public class ControleOpcoes {
    private static ControleOpcoes instancia;
    private Map<String, Opcao> opcoes;

    private ControleOpcoes() {
        opcoes = new HashMap<>();
        opcoes.put("case cadastra", CaseCadastro.getInstancia());
        opcoes.put("case exibe", CaseExibe.getInstancia());
        opcoes.put("cadastra palestrante", CadastraPalestrante.getInstancia());
        opcoes.put("cadastra local", CadastraLocal.getInstancia());
        opcoes.put("cadastra palestra", CadastraPalestra.getInstancia());
        opcoes.put("cadastra show musical", CadastraShowMusical.getInstancia());
    }

    // Singleton - retorna uma unica instancia atraves de metodo statico
    public static ControleOpcoes getInstancia(){
        if(instancia == null) {
            instancia = new ControleOpcoes();
        }
        return instancia;
    }

    public Opcao getOpcao(String nomeOperacao){
        return opcoes.get(nomeOperacao);
    }
}
