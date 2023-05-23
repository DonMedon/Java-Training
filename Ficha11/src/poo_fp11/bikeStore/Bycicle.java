package poo_fp11.bikeStore;

public class Bycicle {

    private int id, numberOfGears;
    private String mainColor;
    private float wheelSize, bikeLength, price;
    private boolean adjustableSeatpost;

    public Bycicle(int id, int numberOfGears, String mainColor, float wheelSize, float bikeLength, float price, boolean adjustableSeatpost) {
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize = wheelSize;
        this.bikeLength = bikeLength;
        this.price = price;
        this.adjustableSeatpost = adjustableSeatpost;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getMainColor() {
        return mainColor;
    }

    public float getWheelSize() {
        return wheelSize;
    }

    public float getBikeLength() {
        return bikeLength;
    }

    public float getPrice() {
        return price;
    }

    public boolean isAdjustableSeatpost() {
        return adjustableSeatpost;
    }
}
