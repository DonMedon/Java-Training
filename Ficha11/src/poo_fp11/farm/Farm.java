package poo_fp11.farm;

import java.util.ArrayList;

public class Farm {
ArrayList<Animal> animals;

    public Farm(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void makeNoise() {
        for (Animal farm: this.animals) {
            farm.fazerBarulho();
        }
}
}
