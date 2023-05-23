package poo_fp11.bikeStore;

import java.util.ArrayList;

public class MountainBike extends Bycicle {

    private int numberOfLights;
    private SuspensionType suspensionType;
    private ArrayList<BikeTools> bikeTools;

    public MountainBike(int id, int numberOfGears, String mainColor, float wheelSize, float bikeLength, float price, boolean adjustableSeatpost, int numberOfLights, SuspensionType suspensionType, ArrayList<BikeTools> bikeTools) {
        super(id, numberOfGears, mainColor, wheelSize, bikeLength, price, adjustableSeatpost);
        this.numberOfLights = numberOfLights;
        this.suspensionType = suspensionType;
        this.bikeTools = bikeTools;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }
    public SuspensionType getSuspensionType() {
        return suspensionType;
    }
    public ArrayList<BikeTools> getBikeTools() {
        return bikeTools;
    }
}
