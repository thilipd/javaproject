package inheritanceDemo;

public class Bicycle {

    protected int gear;
    protected int speed;

    public Bicycle(int startSpeed, int startGear) {
        this.gear = startGear;
        this.speed = startSpeed;

    }

    public void setGear(int newValue) {
        this.gear = newValue;
    }

    public void applyBreak(int decrement) {
        this.speed -= decrement;
    }

    public void accelarate(int increment) {
        this.speed += increment;
    }
}
