package StringPractice;

public class StringImmutable {

    public static void main(String[] args) {

        /**
         * Case 1:
         * s1 created by new operator --> object stored in heap memory --> s1 has the
         * reference of object memory in heap.
         * s2 created by assignment operator --> object stored in string constant pool
         * --> s2 has the reference of object memory in pool.
         * so s1 == s2 is comparing s1 & s2 memory --> it will not be same.
         * To compare the content of object --> use equals() method.
         */

        // String s1 = new String("Hello");
        // String s2 = "Hello";

        // if (s1 == s2) {
        // System.out.println("both are same");
        // } else {
        // System.out.println("not same");
        // }

        // System.out.println(s1.equals(s2));

        /**
         * Case 2:
         * s1 & s2 both are created using assignment operator and have the same value.
         * When a string is created using assignment operator the object is stored in
         * string constant pool.
         * Before storing the object it look for the same content in object is present
         * in the pool.
         * if the object has the same content is present JVM creats another reference
         * variable.
         */

        // String s3 = "Hola";
        // String s4 = "Hola";

        // if (s3 == s4) {
        // System.out.println("both are same");
        // } else {
        // System.out.println("not same");
        // }

        // System.out.println(s3.equals(s4));

        /**
         * Case 3:
         * In the below code s5 value will be printed as "datatype ".
         * But string is immutable.
         * The reason for string is immutable is the content of the object is not
         * changed.
         * When we concanate the 2 strings new string new object is created in memory.
         * In the below example s5 has reference memory of data.
         * and atlast when we concanate the new object created its memory is refered to
         * s5.
         * here the object which has the content as data is not changed, it just lost
         * reference variable.
         */

        // String s5 = "data";
        // String s6 = s5;

        // if (s5 == s6) {
        // System.out.println("both are same");
        // } else {
        // System.out.println("not same");
        // }

        // System.out.println(s5.equals(s6));

    }

}
