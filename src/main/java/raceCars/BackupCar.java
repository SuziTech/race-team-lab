package raceCars;

public class BackupCar extends Cars {

    private int noOfTimesUsed;

    public BackupCar(int fuel, int speed, int noOfTimesUsed){
        super(fuel, speed);
        this.noOfTimesUsed = noOfTimesUsed;
    }
}
