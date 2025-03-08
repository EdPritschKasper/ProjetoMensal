package gestao.eventos.config;

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

    //-------------- GET
    public Pessoa getPessoa(String documento){
        for(Pessoa pessoa: pessoas){
            if(pessoa.getDocumento().equals(documento)) {
                return pessoa;
            }
        }
        return null;
    }

    public Participante getParticipante(String documento){
        for(Participante participante: participantes){
            if(participante.getDocumento().equals(documento)) {
                return participante;
            }
        }
        return null;
    }

    public Palestrante getPalestrante(String documento){
        for(Palestrante palestrante: palestrantes){
            if(palestrante.getDocumento().equals(documento)) {
                return palestrante;
            }
        }
        return null;
    }

    public Musico getMusico(String documento){
        for(Musico musico: musicos){
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

    //--------------PRINTA ALL
    public void printaAllParticipantes(){
        for(Participante participante: participantes){
            System.out.println("Nome: " + participante.getNome() + " Documento: " + participante.getDocumento());
        }
        System.out.println("Qtda: " + participantes.size());
    }

    public void printaAllPalestrantes(){
        for(Palestrante palestrante: palestrantes){
            System.out.println("Nome: " + palestrante.getNome() + " Documento: " + palestrante.getDocumento());
        }
        System.out.println("Qtda: " + palestrantes.size());
    }

    public void printaAllMusicos(){
        for(Musico musico: musicos){
            System.out.println("Nome: " + musico.getNome() + " Documento: " + musico.getDocumento());
        }
        System.out.println("Qtda: " + musicos.size());
    }

    public void printaAllLocais(){
        for(Local local: locais){
            System.out.println("Nome: " + local.getNome());
        }
        System.out.println("Qtda: " + locais.size());
    }

    public void printaAllPalestras(){
        palestras.forEach((id, palestra) -> {
            System.out.println("ID: " + id + " Nome: " + palestra.getNome());
        });
        System.out.println("Qtda: " + palestras.size());
    }

    public void printaAllShowsMusicais(){
        showsMusicais.forEach((id, showMusical) -> {
            System.out.println("ID: " + id + " Nome: " + showMusical.getNome());
        });
        System.out.println("Qtda: " + showsMusicais.size());
    }

    //--------------REMOVE
    public boolean removeParticipante(String documento) {
        for(int i = 0; i < participantes.size(); i++){
            if(participantes.get(i).getDocumento().equals(documento)){
                participantes.remove(i);
                return true;
            }
        }
        return false;
    }
}
