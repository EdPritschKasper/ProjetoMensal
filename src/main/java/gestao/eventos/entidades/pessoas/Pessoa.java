package gestao.eventos.entidades.pessoas;

import gestao.eventos.interfaces.*;

public class Pessoa implements IPrinta {

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

    // metodo interface IPrinta
    public void printaAtributos(){
        System.out.println("Nome: " + getNome());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Telefone: " + getTelefone());
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
