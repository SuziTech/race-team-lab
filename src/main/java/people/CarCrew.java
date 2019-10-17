package people;

public abstract class CarCrew implements IWinner {

    private String name;
    private boolean inHallOfFame = false;

    public CarCrew(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String inaugurate() {
        this.inHallOfFame = true;
        return "You have entered the Hall of Fame";
    }

}
