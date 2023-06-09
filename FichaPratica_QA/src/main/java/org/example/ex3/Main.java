package org.example.ex3;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Leão", Alimento.CARNE);
        animal1.comer(Alimento.PEIXE);
    }
}
