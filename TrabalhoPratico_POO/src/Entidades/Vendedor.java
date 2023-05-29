package Entidades;

import Itens.Arma;
import Itens.ItemHeroi;
import Itens.PocaoHP;
import Itens.TipoHeroi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Vendedor {

    static Scanner input = new Scanner(System.in);
    private ArrayList<ItemHeroi> inventario;

    public Vendedor(ArrayList<ItemHeroi> inventario) {
        this.inventario = inventario;
    }

    public void imprimirInventario() {
        int contador = 0;
        for (ItemHeroi i : this.inventario) {
            contador++;
            if (i instanceof PocaoHP) {

                PocaoHP pocaoHP = (PocaoHP) i;
                System.out.println("Item " + contador);
                pocaoHP.mostrarDetalhes();
            }
            if (i instanceof Arma) {
                Arma arma = (Arma) i;
                System.out.println("Item " + contador);
                arma.mostrarDetalhes();
            }
        }
    }

    public void vender(Heroi heroi) {

        int option;
        /* heroi.getPocoes().remove(0); */
        imprimirInventario();

        System.out.println();
        System.out.println("Qual o item de que deseja comprar?");
        System.out.println("Digite o nº respetivo ou 0 para continuar sem comprar.");

        option = input.nextInt();

        boolean heroiPermitido = false;

        if (option == 0) {
            System.out.println("Não comprou nada. Boa viagem!");
        } else {

            option -= 1;

            for (TipoHeroi i : (inventario.get(option)).getTipoHeroi()) {
                if (i.toString().equals(heroi.getClass().getName().toUpperCase())) ;
                heroiPermitido = true;
                break;
            }
        }

        if (heroiPermitido) {

            if (heroi.getOuro() >= inventario.get(option).getPreco()) {
                heroi.setOuro(heroi.getOuro() - inventario.get(option).getPreco());
                if (inventario.get(option) instanceof PocaoHP) {
                    PocaoHP pocaoHP = (PocaoHP) inventario.get(option);

                    heroi.getPocoes().add(pocaoHP);
                    System.out.println("O herói comprou " + inventario.get(option).getNome() + " por " + inventario.get(option).getPreco() + ".");
                    System.out.println("O herói agora tem " + heroi.getOuro() + " de ouro.");
                }
                if (inventario.get(option) instanceof Arma) {
                    Arma arma = (Arma) inventario.get(option);
                    heroi.setArma(arma);
                    System.out.println("O herói comprou " + inventario.get(option).getNome() + " por " + inventario.get(option).getPreco() + ".");
                    System.out.println("O herói agora tem " + heroi.getOuro() + " de ouro.");
                }
            } else {
                System.out.println("O herói não tem dinheiro suficiente para comprar este item.");
            }

        }
        heroi.mostrarDetalhes();
    }
}

