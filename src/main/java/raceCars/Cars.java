package raceCars;

public abstract class Cars {
    private int speed;
    private int fuel;

    public Cars(int speed, int fuel){
        this.speed = speed;
        this.fuel = fuel;
    }

    public String startCar(){
        return "Engine is running...";
    }
}
