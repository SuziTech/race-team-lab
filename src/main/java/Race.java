import events.Circuit;
import people.CarCrew;
import people.Driver;
import people.IRace;
import people.Navigator;
import raceCars.Cars;
import raceCars.EventCar;

public class Race implements IRace {

    private Driver driver;
    private Navigator navigator;
    private Circuit circuit;
    private EventCar eventCar;

    public Race(Driver driver, Navigator navigator, Circuit circuit, EventCar eventCar) {
        this.driver = driver;
        this.navigator = navigator;
        this.circuit = circuit;
        this.eventCar = eventCar;
    }

    public double race(double endTime, double startTime) {



        double duration = endTime - startTime;

        return duration;
    }

    public Driver getDriver() {
        return driver;
    }

    public Navigator getNavigator() {
        return navigator;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    public EventCar getEventCar() {
        return eventCar;
    }
}
