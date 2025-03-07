package gestao.eventos.entidades.pessoas;

public class Pessoa {

    private String nome;
    private String documento;
    private String telefone;

    public Pessoa(String nome , String documento , String telefone){

        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    // construtor de copia
    public Pessoa(Pessoa pessoa){
        nome = pessoa.nome;
        documento = pessoa.documento;
        telefone = pessoa.telefone;
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
