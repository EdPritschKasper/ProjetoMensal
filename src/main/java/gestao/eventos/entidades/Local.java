package gestao.eventos.entidades;

import gestao.eventos.entidades.pessoas.Pessoa;
import gestao.eventos.BancoDeDados;

public class Local {
    private String nome;
    private String rua;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private Pessoa pessoa;

    public Local(String nome, String rua, String bairro, String cep, String cidade, String estado, Pessoa pessoa) {
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pessoa = pessoa;
    }

    public Local(){}

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
