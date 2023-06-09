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
        int num;
        /* heroi.getPocoes().remove(0); */

        do {
            System.out.println("-------------------------------------------------------------------------------------------------------------------");
            System.out.println("Queres comprar algum item?");
            System.out.println("Tens " + heroi.getOuro() + " de ouro.");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.println("-------------------------------------------------------------------------------------------------------------------");

            num = input.nextInt();

            if (num == 1) {
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.println("LISTA DE ITEMS:");
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                imprimirInventario();
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o item de que queres comprar?");
                System.out.println("Digita o respetivo número de item.");
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                option = input.nextInt();
                System.out.println("-------------------------------------------------------------------------------------------------------------------");

                option -= 1;

                boolean heroiPermitido = false;

                for (TipoHeroi i : (inventario.get(option)).getTipoHeroi()) {
                    if (i.toString().equals(heroi.getClass().getName().toUpperCase())) ;
                    heroiPermitido = true;
                    break;
                }

                if (heroiPermitido) {

                    if (heroi.getOuro() >= inventario.get(option).getPreco()) {
                        heroi.setOuro(heroi.getOuro() - inventario.get(option).getPreco());
                        if (inventario.get(option) instanceof PocaoHP) {
                            PocaoHP pocaoHP = (PocaoHP) inventario.get(option);

                            heroi.getPocoes().add(pocaoHP);
                            System.out.println("-------------------------------------------------------------------------------------------------------------------");
                            System.out.println("Compraste o item " + inventario.get(option).getNome() + " por " + inventario.get(option).getPreco() + ".");
                            System.out.println("Tens agora " + heroi.getOuro() + " de ouro.");
                            System.out.println("-------------------------------------------------------------------------------------------------------------------");
                        }
                        if (inventario.get(option) instanceof Arma) {
                            Arma arma = (Arma) inventario.get(option);
                            heroi.setArma(arma);
                            System.out.println("-------------------------------------------------------------------------------------------------------------------");
                            System.out.println("Compraste o item " + inventario.get(option).getNome() + " por " + inventario.get(option).getPreco() + ".");
                            System.out.println("Tens " + heroi.getOuro() + " de ouro.");
                            System.out.println("-------------------------------------------------------------------------------------------------------------------");
                        }
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Não tens dinheiro suficiente para comprar este item.");
                        System.out.println("-------------------------------------------------------------------------------------------------------------------");
                    }
                }
                heroi.mostrarDetalhes();
            }
            if (num == 2) {
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.println("Não compraste nada. Boa viagem!");
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
            }
        } while (num == 1);
    }


}

