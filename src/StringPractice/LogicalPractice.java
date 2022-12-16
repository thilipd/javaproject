package StringPractice;

import java.util.Scanner;

public class LogicalPractice {

    Scanner sc = new Scanner(System.in);

    public void getCharcterOfAString(String word) {

        // String word = word;//

        System.out.println("the word is : " + word);

        System.out.println("give the chareter to find the index");

        char in = sc.next().charAt(0);

        boolean is = false;

        for (int i = 0; i < word.length(); i++) {

            if (in == word.charAt(i)) {

                is = true;
                System.out.println("the charter index is " + i);

            }

        }

        if (is == false) {
            System.out.println("the charter is not present in word");
        }

    }

}
