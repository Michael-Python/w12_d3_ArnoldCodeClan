package vehicleTests;

import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void setUp() {
        car = new Car("Blue", "1800", 12000);
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals("1800", car.getEngine());
    }
    @Test
    public void hasPrice(){
        assertEquals(12000, car.getPrice());
    }
}