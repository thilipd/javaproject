package StringPractice;

public class Stringmethods {

    public static void main(String[] args) {

        /**
         * equals() method
         * --> returns boolean value
         * --> compares only the string instance
         * --> case sensitive
         */

        // String s1 = new String("Java");
        // String s2 = new String("java");

        // boolean result = s1.equals(s2);

        // System.out.println(result);// false

        /**
         * equalsIgnoreCase()
         * --> eturns boolean value
         * --> compares the object content
         * --> case insensitive
         */

        // String s1 = new String("Java");
        // String s2 = new String("java");

        // boolean result = s1.equalsIgnoreCase(s2);

        // System.out.println(result);// true

        /**
         * compareTo()
         * --> returns a number
         * --> number is positive if it is bigger
         * --> number is negative if it is smaller
         * --> number is zero if it is equal
         * --> by lexicography string comes first is lesser , string comes later is
         * bigger.
         * --> case sensitive
         */
        // String s1 = new String("Java");
        // String s2 = new String("java");

        // int result = s1.compareTo(s2);

        // System.out.println(result);// -32

        /**
         * compareToIgnoreCase()
         * --> returns a number
         * --> number is positive if it is bigger
         * --> number is negative if it is smaller
         * --> number is zero if it is equal
         * --> by lexicography string comes first is lesser , string comes later is
         * bigger.
         * --> case in-sensitive
         */

        // String s1 = new String("Java");
        // String s2 = new String("java");

        // int result = s1.compareToIgnoreCase(s2);

        // System.out.println(result);// 0

        /**
         * contentEquals()
         * --> returns boolean
         * --> similar to equals() , but compares any implementation of char sequence
         * --> case sensitive
         */

        // StringBuffer s1 = new StringBuffer("chair");

        // String s2 = "Chair";

        // boolean result = s2.contentEquals(s1);

        // System.out.println(result);

        /**
         * indexOf()
         * -->
         */

        String s1 = "Chennai, Tamil Nadu";

        System.out.println(s1.substring(14, 19));

    }
}
