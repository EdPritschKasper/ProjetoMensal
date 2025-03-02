package gestao.eventos;

import gestao.eventos.entidades.pessoas.Pessoa;
import gestao.eventos.entidades.pessoas.Palestrante;
import gestao.eventos.entidades.pessoas.Participante;

import java.util.ArrayList;

public class BancoDeDados {

    //Salvar os conteudos desejados

    ArrayList<Pessoa>listaPessoasinfo;
    ArrayList<Palestrante>listaConteudoPalestra;
    ArrayList<Participante> listaNumCadeiras;

    public BancoDeDados(){

        listaPessoasinfo = new ArrayList<>();
        listaConteudoPalestra = new ArrayList<>();
        listaNumCadeiras = new ArrayList<>();
    }

    public boolean cadastrarDados(Pessoa pessoainfo){
        return listaPessoasinfo.add(pessoainfo);

    }

    public boolean cadastrarConteudo(Palestrante conteudo){
        return listaConteudoPalestra.add(conteudo);
    }

    public boolean cadastrarNumCadeira(Participante numCadeira){
        return listaNumCadeiras.add(numCadeira);
    }

}
