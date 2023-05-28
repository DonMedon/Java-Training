package Itens;

import Entidades.Heroi;

import java.util.ArrayList;

public class PocaoHP extends ItemHeroi {
    private int cura;

    public PocaoHP(String nome, int preco, ArrayList<Heroi> tipoHeroi, int cura) {
        super(nome, preco, tipoHeroi);
        this.cura = cura;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("-------------------------------------");
        System.out.println("Nome da poção: " + getNome());
        System.out.println("Preço da poção: " + getPreco());
        System.out.println("Tipo de Herói: " + getTipoHeroi());
        System.out.println("HP curado: " + this.cura);
        System.out.println("-------------------------------------");
    }
}

