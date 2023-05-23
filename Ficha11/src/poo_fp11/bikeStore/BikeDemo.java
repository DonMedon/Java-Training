package poo_fp11.bikeStore;

import java.util.ArrayList;

public class BikeDemo {
    public static void main(String[] args) {

        ArrayList<BikeTools> bikeToolsInstanciado = new ArrayList<>();

        bikeToolsInstanciado.add(BikeTools.WATER);
        bikeToolsInstanciado.add(BikeTools.KIT);

        MountainBike mountainBike1 = new MountainBike(1, 5, "Black", 60, 2, 305, true, 2, SuspensionType.DUPLA, bikeToolsInstanciado);
        MountainBike mountainBike2 = new MountainBike(2, 4, "White", 65, 3, 355, false, 3, SuspensionType.SIMPLES, bikeToolsInstanciado);
        MountainBike mountainBike3 = new MountainBike(3, 3, "Blue", 55, 2, 255, false, 3, SuspensionType.NOSUSPENSION, bikeToolsInstanciado);

        ArrayList<Sponsor> sponsorsInstanciado = new ArrayList<>();

        sponsorsInstanciado.add(Sponsor.NIKE);
        sponsorsInstanciado.add(Sponsor.SHIMANO);
        sponsorsInstanciado.add(Sponsor.W52);

        DeliveryBike deliveryBike1 = new DeliveryBike(4,2, "Red", 45, 2, 215, true, 25, true, sponsorsInstanciado, 1);

        DeliveryBike deliveryBike2 = new DeliveryBike(5,3, "Yellow", 48, 3, 226, false, 20, true, sponsorsInstanciado, 3);

        DeliveryBike deliveryBike3 = new DeliveryBike(6,2, "Purple", 52, 4, 298, false, 37, false, sponsorsInstanciado, 2);

        ArrayList<Bycicle> bikesInstanciado = new ArrayList<>();
        bikesInstanciado.add(deliveryBike1);
        bikesInstanciado.add(deliveryBike2);
        bikesInstanciado.add(mountainBike2);

        BikeManagement bikeManagement = new BikeManagement(bikesInstanciado);

        bikeManagement.imprimirDetalhes();


    }
}