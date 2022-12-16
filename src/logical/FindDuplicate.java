package logical;

import java.util.*;;

public class FindDuplicate {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // int[] arr = { 10, 30, 44, 44, 23, 10, 18, 30 };

        // System.out.println("Enter array size: ");
        // int size = input.nextInt();

        // int[] crr_array = new int[size];
        // int[] new_array = new int[size];
        // int[] times = new int[size];

        // // Read integers from the console
        // System.out.println("Enter array elements: ");
        // for (int i = 0; i < crr_array.length; i++) {
        // crr_array[i] = input.nextInt();
        // times[i] = 1;
        // }

        // // Search for repeated elements
        // for (int j = 0; j < crr_array.length; j++) {
        // for (int i = j; i < crr_array.length; i++) {
        // if (crr_array[j] == crr_array[i] && j != i) {
        // new_array[i] = crr_array[i];
        // times[i]++;
        // }
        // }
        // }

        // // Printing output
        // for (int i = 0; i < new_array.length; i++) {
        // System.out.println("\t" + crr_array[i] + "\t" + new_array[i] + "\t" +
        // times[i]);

        // }

        int[] arr = { 10, 30, 44, 44, 23, 10, 18, 30 };
        int[] result = new int[10];
        int counter = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = true;
                    break;
                }
            }
            if (!isDistinct) {
                result[counter++] = arr[i];
            }
        }

        for (int i = 0; i < counter; i++) {
            count = 0;

            System.out.println(result[i]);
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
                if (result[i] == arr[j]) {
                    count++;
                }

            }
            System.out.println(result[i] + " = " + count);
        }

    }

}
