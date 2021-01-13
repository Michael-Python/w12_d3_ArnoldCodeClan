package partsTest;

import org.junit.Before;
import org.junit.Test;
import vehicleParts.Body;

import static org.junit.Assert.assertEquals;

public class BodyTest {

    Body body;

    @Before
    public void setUP(){
        body = new Body("Sport", "Standard", "Front Left", "Front Right");
    }

    @Test
    public void hasABonnetType(){
        assertEquals("Sport", body.getBonnetType());
    }
    @Test
    public void hasABootType(){
        assertEquals("Standard", body.getBootType());
    }
    @Test
    public void hasADoorType(){
        assertEquals("Front Left", body.getDoorType());
    }
    @Test
    public void hasAWingType(){
        assertEquals("Front Right", body.getWingType());
    }
}
