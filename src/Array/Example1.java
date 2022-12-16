package Array;

import java.util.Scanner;

public class Example1 {

    int[] arr = new int[5];
    String[] subjects = { "JAVA", "Java Script", "Type Script", "React JS", "Node JS" };

    Scanner sc = new Scanner(System.in);

    public void generateValues() {

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter marks for " + subjects[i]);
            arr[i] = sc.nextInt();
        }

        int total = getTotal(arr);

        getAverage(total);
    }

    private int getTotal(int[] arr) {

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Your total marks is " + total);

        return total;
    }

    private void getAverage(int total) {

        float average = ((float) total / arr.length);
        System.out.println("Your average mark is " + average);
    }

}
