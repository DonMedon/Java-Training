package Entidades;

import Itens.ItemHeroi;

import java.util.ArrayList;
import java.util.Iterator;

public class Vendedor {

    private ArrayList<ItemHeroi> itemHerois;

    public Vendedor(ArrayList<ItemHeroi> itemHerois) {
        this.itemHerois = itemHerois;
    }
    public void imprimirInventario() {
        for (ItemHeroi itens: this.itemHerois) {
            itens.mostrarDetalhes();
        }
    }
    public void vender(Heroi heroi) {
        if(heroi.getOuro() > item.getPreco()) {
        }
    }
}
