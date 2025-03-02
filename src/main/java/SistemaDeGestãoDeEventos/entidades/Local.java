package SistemaDeGestãoDeEventos.entidades;

import SistemaDeGestãoDeEventos.entidades.pessoas.CadastroPessoa;

public class Local {
    private String nome;
    private String rua;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private CadastroPessoa pessoa;

    public Local(String nome, String rua, String bairro, String cep, String cidade, String estado, CadastroPessoa pessoa) {
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
