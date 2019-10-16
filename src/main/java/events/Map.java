package events;

public class Map extends Circuit {

    private String serial;

    public Map(String route, String serial) {
        super(route);
        this.serial = serial;
    }

    public Object getSerial() {
        return this.serial;
    }
}
