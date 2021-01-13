package sellers;

import vehicles.VehicleType;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<VehicleType> stock;

    public Dealership(double till){
        this.till = till;
        this.stock = new ArrayList<VehicleType>();
    }

    public double getTill() {
        return till;
    }

    public int getStock() {

        return this.stock.size();
    }
}