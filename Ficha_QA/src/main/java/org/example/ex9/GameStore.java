package org.example.ex9;

import java.util.ArrayList;

public class GameStore {
    private ArrayList<VideoGame> stock;
    private ArrayList<VideoGame> sales;

    public GameStore() {

        stock = new ArrayList<>();
        sales = new ArrayList<>();
    }

    public ArrayList<VideoGame> getStock() {
        return stock;
    }

    public ArrayList<VideoGame> getSales() {
        return sales;
    }

    public void addGameToStock(VideoGame game) {
        stock.add(game);
    }
    public void sellGame(int index) {

        VideoGame game = stock.remove(index);
        sales.add(new VideoGame(game.getName(), game.getPublisher(), game.getCostPrice(), game.getSellingPrice()));

    }
    public boolean displayStock() {

        System.out.println("Stock:");

        for (VideoGame game : stock) {

            System.out.println("Name: " + game.getName());
            System.out.println("Publisher: " + game.getPublisher());
            System.out.println("Cost Price: " + game.getCostPrice());
            System.out.println("Selling Price: " + game.getSellingPrice());
            System.out.println("---------------------------");
        }
        return true;
    }
    public boolean displaySales() {

        System.out.println("Sales:");

        for (VideoGame game : sales) {

            System.out.println("Name: " + game.getName());
            System.out.println("Publisher: " + game.getPublisher());
            System.out.println("Cost Price: " + game.getCostPrice());
            System.out.println("Selling Price: " + game.getSellingPrice());
            System.out.println("---------------------------");
        }
        return true;
    }

    public double calcularLucro() {

        double totalProfit=0;

        for (VideoGame soldGames: sales) {

            totalProfit += soldGames.getSellingPrice() - soldGames.getCostPrice();
        }
        return totalProfit;

    }
}

