package gestao.eventos.entidades.pessoas;

import gestao.eventos.interfaces.*;


import java.util.List;
import java.util.ArrayList;

public class Pessoa implements IPrinta {

    private String nome;
    private String documento;
    private String telefone;
    private List<String> idEventos;

    // construtor parametrizado
    public Pessoa(String nome , String documento , String telefone){
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
        this.idEventos = new ArrayList<>();
    }

    // construtor padrão
    public Pessoa(){
        this.idEventos = new ArrayList<>();
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

    public List<String> getIdEventos() {
        return idEventos;
    }

    public void addIdEvento(String idEvento) {
        idEventos.add(idEvento);
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void copiaAtributos(Pessoa pessoa){
        nome = pessoa.getNome();
        documento = pessoa.getDocumento();
        telefone = pessoa.getTelefone();
    }
}
