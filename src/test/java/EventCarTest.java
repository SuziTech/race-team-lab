import org.junit.Before;
import org.junit.Test;
import raceCars.EventCar;

import static org.junit.Assert.assertEquals;

public class EventCarTest {

    EventCar eventCar;

    @Before
    public void before() {
        eventCar = new EventCar("22", "RAC", 100 , 75);
    }

    @Test
    public void canInaugurate() {
        assertEquals("You have entered the Hall of Fame", eventCar.inaugurate());
    }


}
