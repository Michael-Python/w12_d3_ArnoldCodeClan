package vehicleParts;

public class Engine{
    private String fuelType;
    private String brand;
    private int horsePower;

    public Engine(String fuelType, String brand, int horsePower) {
        this.fuelType = fuelType;
        this.brand = brand;
        this.horsePower = horsePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
