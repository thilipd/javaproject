package interfaceDemo;

public class App {

    public static void main(String[] args) {

        MountainBike himalyan = new MountainBike(10, 30, 6);

        System.out.println(himalyan.getSpeed());

        himalyan.setHeight(20);

        himalyan.applyBreak(2);

        System.out.println(himalyan.getSpeed());

        himalyan.accelarate(10);

        System.out.println(himalyan.getSpeed());

    }

}
