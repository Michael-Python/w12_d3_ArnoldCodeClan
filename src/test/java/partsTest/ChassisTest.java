package partsTest;

import org.junit.Before;
import org.junit.Test;
import vehicleParts.Chassis;

import static org.junit.Assert.assertEquals;

public class ChassisTest {

    Chassis chassis;

    @Before
    public void setUp(){
        chassis = new Chassis("4 x 4");
    }

    @Test
    public void hasChassisType(){
        assertEquals("4 x 4", chassis.getChassisType());
    }
}
