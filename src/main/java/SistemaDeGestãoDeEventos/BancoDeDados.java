package SistemaDeGestãoDeEventos;

import java.util.ArrayList;

public class BancoDeDados {

    //Salvar os conteudos desejados

    ArrayList<CadastroPessoa>listaPessoasinfo;
    ArrayList<Palestrante>listaConteudoPalestra;
    ArrayList<Participantes> listaNumCadeiras;

    public BancoDeDados(){

        listaPessoasinfo = new ArrayList<>();
        listaConteudoPalestra = new ArrayList<>();
        listaNumCadeiras = new ArrayList<>();
    }

    public boolean cadastrarDados(CadastroPessoa pessoainfo){
        return listaPessoasinfo.add(pessoainfo);

    }

    public boolean cadastrarConteudo(Palestrante conteudo){
        return listaConteudoPalestra.add(conteudo);
    }

    public boolean cadastrarNumCadeira(Participantes numCadeira){
        return listaNumCadeiras.add(numCadeira);
    }

}
