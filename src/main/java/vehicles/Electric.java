package vehicles;

import vehicleParts.Chassis;
import vehicleParts.Body;
import vehicleParts.Battery;
import vehicleParts.Wheels;

public class Electric extends VehicleType {

    public Electric(String colour, String engine, int price) {
        super(colour, engine, price);
    }
}
