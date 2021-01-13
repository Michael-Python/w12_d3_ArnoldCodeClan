package vehicles;

public abstract class VehicleType {
    private String colour;
    private String engine;
    private int price;

    public VehicleType(String colour, String engine, int price){
        this.colour = colour;
        this.engine = engine;
        this. price = price;
    }


    public String getColour() {
        return colour;
    }

    public String getEngine() {
        return engine;
    }

    public int getPrice() {
        return price;
    }
}
