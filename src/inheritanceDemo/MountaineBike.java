package inheritanceDemo;

public class MountaineBike extends Bicycle {

    public int seatHeight;

    public MountaineBike(int startHeight, int startGear, int startSpeed) {
        super(startSpeed, startGear);
        this.seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        this.seatHeight = newValue;

    }

}
