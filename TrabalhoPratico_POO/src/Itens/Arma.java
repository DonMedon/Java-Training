package Itens;

import Entidades.Heroi;

import java.util.ArrayList;

public class Arma extends ItemHeroi{

    private int dano;

    public Arma(String nome, int preco, ArrayList<TipoHeroi> tipoHeroi, int dano) {
        super(nome, preco, tipoHeroi);
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("------------------------------------");
        System.out.println("Nome da arma: " + getNome());
        System.out.println("Preço da arma: " + getPreco());
        System.out.println("Tipo de Herói: " + getTipoHeroi());
        System.out.println("Dano da arma: " + this.dano);
        System.out.println("------------------------------------");
    }
}
