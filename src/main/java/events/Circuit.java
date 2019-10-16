package events;

public abstract class Circuit {

    private String route;

    public Circuit(String route){
        this.route = route;
    }

    public String getRoute(){
        return this.route;
    }
}
