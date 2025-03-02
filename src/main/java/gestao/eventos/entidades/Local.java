package gestao.eventos.entidades;

import gestao.eventos.entidades.pessoas.Pessoa;

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

    public String getNome() { return nome; }
}
