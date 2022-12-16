package inheritanceDemo;

public class MountaineBike extends Bicycle {

    public int seatHeight;

    public MountaineBike(int startHeight, int startGear, int startSpeed) {
        super(startSpeed, startGear);
        this.seatHeight = startHeight;
        System.out.println(startGear + "-" + startSpeed);
    }

    public void setHeight(int newValue) {
        this.seatHeight = newValue;

    }

    @Override
    public void accelarate(int increment) {
        this.speed += increment + 2;
    }

}
