package raceCars;

import java.util.ArrayList;

public class EventCar extends Cars {

    private String carNumber;
    private String eventsFinished;

    public EventCar(String carNumber, String eventsFinished, int speed, int fuel){
        super(speed, fuel);
        this.carNumber = carNumber;
        this.eventsFinished = eventsFinished;
    }
}
