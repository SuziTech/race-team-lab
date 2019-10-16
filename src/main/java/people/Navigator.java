package people;

public class Navigator extends CarCrew implements IRide, INavigate{

    private int mistakeCount;

    public Navigator(String name, int mistakeCount) {
        super(name);
        this.mistakeCount = mistakeCount;
    }

    public String ride(){
        return "I'm Navigating...";
    }

    public String useMap() {
        return "I'm using a map...";
    }
}
