package gestao.eventos.entidades.pessoas;

public class Participante extends Pessoa {

    private String numCadeira;


    public Participante(String nome , String documento , String telefone , String numCadeira){
        super(nome, documento, telefone);
        this.numCadeira = numCadeira;

    }

    public String getNumCadeira() {
        return numCadeira;
    }
}
