import events.Circuit;
import people.Driver;
import people.Navigator;
import raceCars.EventCar;

public class Race {

    private Driver driver;
    private Navigator navigator;
    private Circuit circuit;
    private EventCar eventCar;
    private double endTime;
    private double startTime;



    public Race(Driver driver, Navigator navigator, Circuit circuit, EventCar eventCar, double endTime, double startTime) {
        this.driver = driver;
        this.navigator = navigator;
        this.circuit = circuit;
        this.eventCar = eventCar;
        this.endTime = endTime;
        this.startTime = startTime;
//        HashMap<String, Double> raceTimes = new HashMap<String, Double>();
    }

//    public double race(double endTime, double startTime) {
//        double duration = endTime - startTime;
//        return duration;
//    }

    public double calculateDuration() {
        return this.endTime - this.startTime;
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
