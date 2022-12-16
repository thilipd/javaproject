package inheritanceDemo;

public class App {

    public static void main(String[] args) {

        Bicycle hero = new Bicycle(4, 3);

        Bicycle himalayan = new MountaineBike(20, 6, 5);

        ((MountaineBike) himalayan).setHeight(15);

        himalayan.accelarate(8);

        System.out.println(((MountaineBike) himalayan).seatHeight);
        System.out.println(himalayan.speed);

        hero.setGear(5);
        hero.accelarate(4);

        System.out.println(hero.gear);
        System.out.println(hero.speed);

    }
}
