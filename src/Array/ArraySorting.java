package Array;

public class ArraySorting {

    int[] arr = { 7, 8, 99, 2, 19 };

    private void displayNow() {
        System.out.println("The given array is");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    private void displayAfter() {
        System.out.println("The sorted array is");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public void ascendingOrder() {

        displayNow();

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        displayAfter();

    }

    public void decendingOrder() {

        displayNow();

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        displayAfter();

    }

}
