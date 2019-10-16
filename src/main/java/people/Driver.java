package people;

public class Driver extends CarCrew implements IRide{

    private int noOfWins;

    public Driver(String name, int noOfWins) {
        super(name);
        this.noOfWins = noOfWins;
    }

    public String ride(){
        return "I'm Driving...";
    }
}
