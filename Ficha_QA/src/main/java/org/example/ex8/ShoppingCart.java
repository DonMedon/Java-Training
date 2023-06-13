package org.example.ex8;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<String> items;
    private String codCliente;
    public ShoppingCart(String codCliente) {
        this.codCliente=codCliente;
        this.items = new ArrayList<>();
    }
    public boolean addItem(String item) {
        return items.add(item);
    }
    public boolean removeItem(String item) {
        return items.remove(item);
    }
    public boolean containsItem(String item) {
        return items.contains(item);
    }
    public int getItemCount() {
        return items.size();
    }
    public boolean clearCart() {
        items.clear();
        return true;

    }
}