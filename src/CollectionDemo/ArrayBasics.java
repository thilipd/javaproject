package CollectionDemo;

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        String[] arr = { "thilip", "udhaya", "akshi", "danny" };
        String[] arr2 = { "thilip", "udhaya", "akshi", "danny", "sheik" };

        /*
         * Arrays.equals method is to compare the array values
         * returns boolean value
         * has two parameters
         */

        CompartorDemo com = new CompartorDemo();

        Arrays.sort(arr, com);

        boolean same = Arrays.equals(arr, arr2);
        System.out.println(same);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
