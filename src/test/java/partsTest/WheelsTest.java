package partsTest;

import org.junit.Before;
import org.junit.Test;
import vehicleParts.Wheels;

import static org.junit.Assert.assertEquals;

public class WheelsTest {

    Wheels wheels;

    @Before
    public void setUP(){
        wheels = new Wheels(19, "Low");
    }

    @Test
    public void hasTyreSize(){
        assertEquals(19, wheels.getSizeInches());
    }
    @Test
    public void hasTyreProfile(){
        assertEquals("Low", wheels.getTyreProfile());
    }
}
