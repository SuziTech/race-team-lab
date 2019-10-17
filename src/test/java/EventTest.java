import events.Circuit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import people.Driver;
import people.Navigator;
import raceCars.EventCar;

import static org.junit.Assert.assertEquals;

public class EventTest {

    Event event;
    Driver driver;
    Navigator navigator;
    EventCar eventCar;
    Circuit circuit;
    Race race1;
    Driver driver2;
    Navigator navigator2;
    EventCar eventCar2;
    Race race2;

    @Before
    public void before() {
        driver = new Driver("Fred", 0);
        driver2 = new Driver("Jim", 0);
        navigator = new Navigator( "Mary", 1);
        navigator2 = new Navigator( "Bob", 1);
        eventCar = new EventCar("22", "RAC", 100 , 75);
        eventCar2 = new EventCar("43", "RAC", 90 , 65);
        circuit = new Circuit("Esholt");
        race1 = new Race(driver, navigator, circuit, eventCar, 15.40, 15.25);
        race2 = new Race(driver2, navigator2, circuit, eventCar2, 16.30, 16.00);
        event = new Event("Yorkshire Rally");
    }

    @Test
    public void canRecordRaces() {
        event.race(race1);
        assertEquals(1, event.countRaceTimesList());
    }

    @Test
    public void canFindWinner() {
        event.race(race1);
        event.race(race2);
        assertEquals(race1, event.findWinner());
    }


}
