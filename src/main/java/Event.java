

import java.util.ArrayList;

public class Event {

    private String name;
    private ArrayList<Race> raceTimes = new ArrayList<Race>();

    public Event(String name) {
        this.name = name;

    }

    public void race(Race race) {
        raceTimes.add(race);
    }

    public int countRaceTimesList() {
        return raceTimes.size();
    }

    public Race findWinner() {
        Race winner = this.raceTimes.get(0);
       for (Race race : this.raceTimes) {
           if (race.calculateDuration() < winner.calculateDuration()) {
               winner = race;
           }
       }
       return winner;
    }



}
