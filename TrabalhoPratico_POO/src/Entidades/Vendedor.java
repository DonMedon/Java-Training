package Entidades;

import Itens.Arma;
import Itens.ItemHeroi;
import Itens.PocaoHP;

import java.util.ArrayList;
import java.util.Iterator;

public class Vendedor {

    private ArrayList<ItemHeroi> itens;

    public Vendedor(ArrayList<ItemHeroi> itemHerois) {
        this.itens = itemHerois;
    }
    public void imprimirInventario() {
        for (ItemHeroi i: this.itens) {
            i.mostrarDetalhes();
        }
    }
    public void vender(Heroi heroi) {

        for(ItemHeroi i: this.itens) {

            if (heroi.getOuro() >= i.getPreco()) {

                if(i instanceof PocaoHP) {
                PocaoHP pocaoHP = (PocaoHP) i;
                heroi.setOuro(heroi.getOuro() - i.getPreco());
                System.out.println("O herói comprou " + i.getNome() + " por " + i.getPreco() + ".");

                }
                if (i instanceof Arma) {
                    Arma arma = (Arma) i;
                    heroi.setOuro(heroi.getOuro() - i.getPreco());
                    System.out.println("O herói comprou " + i.getNome() + " por " + i.getPreco() + ".");

                }
            }
        }

    }
}
