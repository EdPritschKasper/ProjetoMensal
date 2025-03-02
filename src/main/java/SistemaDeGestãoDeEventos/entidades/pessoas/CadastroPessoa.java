package SistemaDeGestãoDeEventos.entidades.pessoas;

public class CadastroPessoa {

    private String nome;
    private String documento;
    private String telefone;

    public CadastroPessoa(String nome , String documento , String telefone){

        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDocumento() {
        return this.documento;
    }

    public String getTelefone() {
        return this.telefone;
    }
}
