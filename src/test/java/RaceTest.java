import events.Circuit;
import org.junit.Before;
import org.junit.Test;
import people.Driver;
import people.Navigator;
import raceCars.Cars;
import raceCars.EventCar;

import static org.junit.Assert.assertEquals;

public class RaceTest {
    Race race;
    Driver driver;
    Navigator navigator;
    EventCar eventCar;
    Cars cars;
    Circuit circuit;


    @Before
    public void before() {
        driver = new Driver("Fred", 0);
        navigator = new Navigator( "Mary", 1);
        eventCar = new EventCar("22", "RAC", 100 , 75);
        circuit = new Circuit("Esholt");
        race = new Race(driver, navigator, circuit, eventCar, 15.40, 15.25);
    }

    @Test
    public void hasDriver() {
        assertEquals(driver, race.getDriver());
    }

    @Test
    public void hasNavigator() {
        assertEquals(navigator, race.getNavigator());
    }

    @Test
    public void hasEventCar() {
        assertEquals(eventCar, race.getEventCar());
    }

    @Test
    public void hasCircuit() {
        assertEquals(circuit, race.getCircuit());
    }

    @Test
    public void canCalculateDuration() {
        assertEquals(0.15, race.calculateDuration(), 0.01);
    }


}
