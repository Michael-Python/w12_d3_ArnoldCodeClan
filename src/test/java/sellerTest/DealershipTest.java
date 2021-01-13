package sellerTest;

import org.junit.Before;
import org.junit.Test;
import sellers.Dealership;

import static org.junit.Assert.assertEquals;


public class DealershipTest {

    Dealership dealership;

    @Before
    public void setUp(){
        dealership = new Dealership(130675.67);
    }

//    @Test
//    public void hasMoneyInTill(){
//        assertEquals(130675.67, dealership.getTill());
//    }

    @Test
    public void canGetStock(){
        assertEquals(0, dealership.getStock());
    }
}
