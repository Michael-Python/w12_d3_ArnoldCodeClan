package vehicles;

import vehicleParts.Chassis;
import vehicleParts.Engine;
import vehicleParts.Wheels;
import vehicleParts.Body;

public class Car extends VehicleType{
    public Car(String colour, String engine, int price) {
        super(colour, engine, price);
    }
}
