package org.example.ex8;

public class Main {
    public static void main(String[] args) {

        ShoppingCart carrinho = new ShoppingCart("22");

        carrinho.addItem("Twix");
        carrinho.addItem("Kit Kat");
        carrinho.addItem("Milka");

        System.out.println(carrinho.getItemCount());

        carrinho.removeItem("Twix");

        System.out.println(carrinho.getItemCount());

        carrinho.removeItem("Milka");

        if (carrinho.containsItem("Milka")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        carrinho.clearCart();

        System.out.println(carrinho.getItemCount());
    }
}
