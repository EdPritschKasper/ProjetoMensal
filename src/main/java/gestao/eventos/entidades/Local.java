package gestao.eventos.entidades;

import gestao.eventos.entidades.pessoas.Pessoa;
import gestao.eventos.config.BancoDeDados;
import gestao.eventos.interfaces.*;

public class Local implements IPrinta {
    private String nome;
    private String rua;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private Pessoa pessoa;

    // construtor parametrizado
    public Local(String nome, String rua, String bairro, String cep, String cidade, String estado, Pessoa pessoa) {
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pessoa = pessoa;
    }

    // construtor padrão
    public Local(){}

    public void copiaAtributos(Local local){
        this.nome = local.getNome();
        this.rua = local.getRua();
        this.bairro = local.getBairro();
        this.cep = local.getCep();
        this.cidade = local.getCidade();
        this.estado = local.getEstado();
        this.pessoa = local.getPessoa();
    }

    // metodo interface IPrinta
    public void printaAtributos(){
        System.out.println("Nome: " + getNome());
        System.out.println("Rua: " + getRua());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Cep: " + getCep());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Estado: " + getEstado());
    }

    public String getNome() {
        return nome;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPessoa(String documento) {
        BancoDeDados banco = BancoDeDados.getInstancia();
        this.pessoa = banco.getPessoa(documento);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}
