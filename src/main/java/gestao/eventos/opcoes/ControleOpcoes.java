package gestao.eventos.opcoes;

import java.util.HashMap;
import java.util.Map;

import gestao.eventos.opcoes.altera.AlteraLocal;
import gestao.eventos.opcoes.cadastro.*;
//import gestao.eventos.opcoes.exibe.*;
import gestao.eventos.opcoes.cases.CaseAltera;
import gestao.eventos.opcoes.cases.CaseCadastro;
import gestao.eventos.opcoes.cases.CaseExibe;
import gestao.eventos.opcoes.cases.CaseRemove;

// Classe que carrega todas as opções dentro dos switch cases
public class ControleOpcoes {
    private static ControleOpcoes instancia;
    private Map<String, Opcao> opcoes;

    private ControleOpcoes() {
        opcoes = new HashMap<>();
        // Switch Cases
        opcoes.put("case cadastra", CaseCadastro.getInstancia());
        opcoes.put("case exibe", CaseExibe.getInstancia());
        opcoes.put("case remove", CaseRemove.getInstancia());
        opcoes.put("case altera", CaseAltera.getInstancia());

        // Opções de cadastro
        opcoes.put("cadastra participante", CadastraParticipante.getInstancia());
        opcoes.put("cadastra palestrante", CadastraPalestrante.getInstancia());
        opcoes.put("cadastra musico", CadastraPalestrante.getInstancia());
        opcoes.put("cadastra local", CadastraLocal.getInstancia());
        opcoes.put("cadastra palestra", CadastraPalestra.getInstancia());
        opcoes.put("cadastra show musical", CadastraShowMusical.getInstancia());

        // Opções de alteração
        opcoes.put("altera local", AlteraLocal.getInstancia());
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
