package partsTest;

import org.junit.Before;
import org.junit.Test;
import vehicleParts.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp(){
        engine = new Engine("Diesel", "Midas", 2500);
    }

    @Test
    public void hasFuelType(){
        assertEquals("Diesel", engine.getFuelType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Midas", engine.getBrand());
    }

    @Test
    public void hasHorsePower(){
        assertEquals(2500, engine.getHorsePower());
    }
}
