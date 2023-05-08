package Ex3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> alimentacao = new ArrayList<String>();
        alimentacao.add("racao");
        alimentacao.add("carne");
        alimentacao.add("peixe");
        alimentacao.add("ervas");

        Animal animal1 = new Animal("Elefante", "Africano", "Quénia", 450.0, alimentacao);


        if (animal1.comer("dfd", 5020.2)) {
            System.out.println("O " + animal1.getNome() + " comeu");
        } else {
            System.out.println("O " + animal1.getNome() + " recusou a comida");

        }
            System.out.println("Agora pesa: " + animal1.getPeso() + " KG");
    }
}
