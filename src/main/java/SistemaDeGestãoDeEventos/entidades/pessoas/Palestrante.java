package SistemaDeGestãoDeEventos.entidades.pessoas;

public class Palestrante extends CadastroPessoa {

    private String conteudoPalestra;

    public Palestrante(String nome , String documento , String telefone , String conteudoPalestra){
        super(nome, documento, telefone);
        this.conteudoPalestra = conteudoPalestra;
    }

    public String getConteudoPalestra() {
        return this.conteudoPalestra;
    }
}



