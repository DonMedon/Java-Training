package Ex6;

import java.util.ArrayList;

public class Competicao {

    private ArrayList<Atleta> listaAtletas;

    private ArrayList<Competicao> listaCompeticao;
    private String nome, pais;

    public Competicao(ArrayList<Atleta> listaAtletas, String nome, String pais, ArrayList<Competicao>listaCompeticao) {
        this.listaAtletas = listaAtletas;
        this.nome = nome;
        this.pais = pais;
        this.listaCompeticao = listaCompeticao;
    }

    public ArrayList<Atleta> getLista() {
        return listaAtletas;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public void addAtletas(Atleta newAtleta) {
        this.listaAtletas.add(newAtleta);

    }

    public void addCompeticao(Competicao newCompeticao) {
        this.listaCompeticao.add(newCompeticao);
    }
}

