package Itens;

import Entidades.Heroi;

import java.util.ArrayList;

abstract public class ItemHeroi {
    private String nome;
    int preco;
    private ArrayList<TipoHeroi> tipoHeroi;

    public ItemHeroi(String nome, int preco, ArrayList<TipoHeroi> tipoHeroi) {
        this.nome = nome;
        this.preco = preco;
        this.tipoHeroi = tipoHeroi;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public ArrayList<TipoHeroi> getTipoHeroi() {
        return tipoHeroi;
    }

    abstract public void mostrarDetalhes();
}

