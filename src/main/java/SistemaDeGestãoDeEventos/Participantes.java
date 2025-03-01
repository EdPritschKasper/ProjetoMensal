package SistemaDeGestãoDeEventos;

public class Participantes extends CadastroPessoa{

    private String numCadeira;


    public Participantes(String nome , String documento , String telefone , String numCadeira){
        super(nome, documento, telefone);
        this.numCadeira = numCadeira;

    }

    public String getNumCadeira() {
        return numCadeira;
    }
}
