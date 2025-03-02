package gestao.eventos.entidades.pessoas;

public class Palestrante extends Pessoa {

    private String conteudoPalestra;

    public Palestrante(String nome , String documento , String telefone , String conteudoPalestra){
        super(nome, documento, telefone);
        this.conteudoPalestra = conteudoPalestra;
    }

    public String getConteudoPalestra() {
        return this.conteudoPalestra;
    }
}



