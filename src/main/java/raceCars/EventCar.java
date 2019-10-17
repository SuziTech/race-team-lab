package raceCars;

import people.IWinner;

import java.util.ArrayList;

public class EventCar extends Cars implements IWinner {

    private String carNumber;
    private String eventsFinished;
    private boolean inHallOfFame = false;

    public EventCar(String carNumber, String eventsFinished, int speed, int fuel){
        super(speed, fuel);
        this.carNumber = carNumber;
        this.eventsFinished = eventsFinished;

    }

    public String inaugurate() {
        this.inHallOfFame = true;
        return "You have entered the Hall of Fame";
    }
}
