package interfaceDemo;

public class MountainBike implements InterfaceA, Bicycle {

    private int height;
    private int speed;
    private int gear;

    public MountainBike(int height, int speed, int gear) {
        this.height = height;
        this.speed = speed;
        this.gear = gear;
    }

    public void setHeight(int height) {
        this.height = height;

        System.out.println(y + "hello");

    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHeight() {
        return this.height;
    }

    public int getGear() {
        return this.gear;
    }

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void applyBreak(int decrement) {
        this.speed -= decrement;
        System.out.println(Bicycle.y);

    }

    @Override
    public void accelarate(int increment) {
        this.speed += increment;
    }

}
