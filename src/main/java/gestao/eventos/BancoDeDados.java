package gestao.eventos;

import gestao.eventos.entidades.Local;
import gestao.eventos.entidades.eventos.Palestra;
import gestao.eventos.entidades.eventos.ShowMusical;
import gestao.eventos.entidades.pessoas.Musico;
import gestao.eventos.entidades.pessoas.Pessoa;
import gestao.eventos.entidades.pessoas.Palestrante;
import gestao.eventos.entidades.pessoas.Participante;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class BancoDeDados {

    //Salvar os conteudos desejados

//    ArrayList<Pessoa>listaPessoasinfo;
//    ArrayList<Palestrante>listaConteudoPalestra;
//    ArrayList<Participante> listaNumCadeiras;
    private List<Pessoa> pessoas;
    private List<Participante> participantes;
    private List<Palestrante> palestrantes;
    private List<Musico> musicos;
    private List<Local> locais;
    private Map<String, Palestra> palestras;
    private Map<String, ShowMusical> showsMusicais;
    private static BancoDeDados instancia;

//    public BancoDeDados(){
//
//        listaPessoasinfo = new ArrayList<>();
//        listaConteudoPalestra = new ArrayList<>();
//        listaNumCadeiras = new ArrayList<>();
//    }

    private BancoDeDados() {
        pessoas = new ArrayList<>();
        participantes = new ArrayList<>();
        palestrantes = new ArrayList<>();
        musicos = new ArrayList<>();
        locais = new ArrayList<>();
        palestras = new HashMap<>();
        showsMusicais = new HashMap<>();
    }

//    public boolean cadastrarDados(Pessoa pessoainfo){
//        return listaPessoasinfo.add(pessoainfo);
//
//    }
//
//    public boolean cadastrarConteudo(Palestrante conteudo){
//        return listaConteudoPalestra.add(conteudo);
//    }
//
//    public boolean cadastrarNumCadeira(Participante numCadeira){
//        return listaNumCadeiras.add(numCadeira);
//    }

    // Singleton - retorna uma unica instancia statica do banco
    public static BancoDeDados getInstancia() {
        if(instancia == null) {
            instancia = new BancoDeDados();
        }
        return instancia;
    }

    //---------- SETTERS ----------//
    public void adicionaPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void adicionaParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void adicionaPalestrante(Palestrante palestrante) {
        palestrantes.add(palestrante);
    }

    public void adicionaMusico(Musico musico) {
        musicos.add(musico);
    }

    public void adicionaLocal(Local local) {
        locais.add(local);
    }

    public void adicionaPalestra(String id, Palestra palestra){
        palestras.put(id, palestra);
    }

    public void adicionaShowMusical(String id, ShowMusical showMusical) {
        showsMusicais.put(id, showMusical);
    }

    //---------- GETTERS ----------//
    public Pessoa getPessoa(String documento){
        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa.getDocumento());
            if(pessoa.getDocumento().equals(documento)) {
                return pessoa;
            }
        }
        return null;
    }

    public Participante getParticipante(String documento){
        for(Participante participante: participantes){
            System.out.println(participante.getDocumento());
            if(participante.getDocumento().equals(documento)) {
                return participante;
            }
        }
        return null;
    }

    public Palestrante getPalestrante(String documento){
        for(Palestrante palestrante: palestrantes){
            System.out.println(palestrante.getDocumento());
            if(palestrante.getDocumento().equals(documento)) {
                return palestrante;
            }
        }
        return null;
    }

    public Musico getMusico(String documento){
        for(Musico musico: musicos){
            System.out.println(musico.getDocumento());
            if(musico.getDocumento().equals(documento)) {
                return musico;
            }
        }
        return null;
    }

    public Local getLocal(String nome){
        for(Local local: locais){
            if(local.getNome().equals(nome)) {
                return local;
            }
        }
        return null;
    }
}
