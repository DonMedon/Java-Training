package poo_fp11.bikeStore;

import java.util.ArrayList;

public class DeliveryBike extends Bycicle {

    private float basketCapicity;
    private boolean isFrontBasket;
    final int sponsorSize = 10;
    private ArrayList<Sponsor> sponsors;
    private int numberOfSponsor;

    public DeliveryBike(int id, int numberOfGears, String mainColor, float wheelSize, float bikeLength, float price, boolean adjustableSeatpost, float basketCapicity, boolean isFrontBasket, ArrayList<Sponsor> sponsors, int numberOfSponsor) {
        super(id, numberOfGears, mainColor, wheelSize, bikeLength, price, adjustableSeatpost);
        this.basketCapicity = basketCapicity;
        this.isFrontBasket = isFrontBasket;
        this.sponsors = sponsors;
        this.numberOfSponsor = numberOfSponsor;
    }

    public float getBasketCapicity() {
        return basketCapicity;
    }
    public boolean isFrontBasket() {
        return isFrontBasket;
    }
    public int getSponsorSize() {
        return sponsorSize;
    }
    public ArrayList<Sponsor> getSponsors() {
        return sponsors;
    }
    public int getNumberOfSponsor() {
        return numberOfSponsor;
    }
}
