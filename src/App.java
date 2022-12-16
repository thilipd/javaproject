import firstpacage.student;

public class App extends User {
    public static void main(String[] args) throws Exception {

        System.out.println("Number of Command Line Argument = " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
        }

        student thilip = new student();

        thilip.name = "thilip";
        thilip.roll = 1;

        thilip.marks[0] = 100;
        thilip.marks[1] = 99;
        thilip.marks[2] = 100;

        int total = thilip.totalMark();

        System.out.println("The total mark is" + total);

        double ave = thilip.average();

        System.out.println("The average mark is" + ave);

    }
}
