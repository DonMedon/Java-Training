package poo_fp11.farm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cao oliver = new Cao();
        Gato botas = new Gato();
        Vaca indiana = new Vaca();
        Porco ronco = new Porco();
        Galinha cristas = new Galinha();


        ArrayList<Animal> listaAnimals = new ArrayList<>();
        Farm quintaDoManel = new Farm(listaAnimals);

        listaAnimals.add(oliver);
        listaAnimals.add(botas);
        listaAnimals.add(indiana);
        listaAnimals.add(ronco);
        listaAnimals.add(cristas);

        quintaDoManel.makeNoise();


    }
}
