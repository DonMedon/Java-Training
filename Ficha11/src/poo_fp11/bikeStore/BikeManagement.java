package poo_fp11.bikeStore;

import java.util.ArrayList;

public class BikeManagement {

    private ArrayList<Bycicle> bikes;
    private MountainBike mountainBike;
    private DeliveryBike deliveryBike;

    public BikeManagement(ArrayList<Bycicle> bikes) {
        this.bikes = bikes;
    }

    public void imprimirDetalhes() {

        int maiorID;

        for (Bycicle bike : bikes) {
            System.out.println("ID: " + bike.getId());
            System.out.println("Number of gears: " + bike.getNumberOfGears());
            System.out.println("Main color: " + bike.getMainColor());
            System.out.println("Wheel Size: " + bike.getWheelSize());
            System.out.println("Bike Length: " + bike.getBikeLength());
            System.out.println("Price: " + bike.getPrice());
            System.out.println("Adjustable Seatpost? " + bike.isAdjustableSeatpost());

            if (bike instanceof MountainBike) {
                MountainBike mountainBike = (MountainBike) bike;
                System.out.println("Number of lights: " + mountainBike.getNumberOfLights());
                System.out.println("Suspension Type: " + mountainBike.getSuspensionType());
                System.out.println("Bike tools: " + mountainBike.getBikeTools());
            }
            if (bike instanceof DeliveryBike) {
                DeliveryBike deliveryBike = (DeliveryBike) bike;
                System.out.println("Basket Capicity: " + deliveryBike.getBasketCapicity());
                System.out.println("Front Basket? " + deliveryBike.isFrontBasket());
                System.out.println("Number of Sponsors: " + deliveryBike.getNumberOfSponsor());
                System.out.println("Sponsors: " + deliveryBike.getSponsors());

            }
        }
    }
}

