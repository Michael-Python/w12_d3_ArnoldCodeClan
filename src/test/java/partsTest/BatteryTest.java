package partsTest;

import org.junit.Before;
import org.junit.Test;
import vehicleParts.Battery;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    Battery battery;

    @Before
    public void setUP() {
        battery = new Battery("AC Brushless", "7Kw");
    }

    @Test
    public void hasMotorType() {
        assertEquals("AC Brushless", battery.getMotorType());
    }

    @Test
    public void hasChargerType() {
        assertEquals("7Kw", battery.getChargerType());
    }
}
