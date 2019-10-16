import org.junit.Before;
import org.junit.Test;
import people.Driver;

import static org.junit.Assert.assertEquals;

public class DriverTest {

    Driver driver;

    @Before
    public void before() {
        driver = new Driver("Betty", 6);
    }

    @Test
    public void hasName() {
        assertEquals("Betty", driver.getName());
    }

    @Test
    public void driverCanRide() {
        assertEquals("I'm Driving...", driver.ride());
    }

}
