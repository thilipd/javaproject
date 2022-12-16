package StringPractice;

public class CountOfString {

    public static int countOfFirstChar(String word) {

        char first = word.charAt(0);

        int count = 1;

        for (int i = 1; i < word.length(); i++) {

            if (first == word.charAt(i)) {
                ++count;
            }
        }

        return count;

    }

    public static int countOfGivenChar(String word, char charecter) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (charecter == word.charAt(i)) {
                ++count;
            }
        }

        return count;

    }

    public static int findCountOfVowels(String word) {

        int count = 0;

        int countOfA = 0;
        int countOfE = 0;
        int countOfU = 0;
        int countOfI = 0;
        int countOfO = 0;

        for (int i = 0; i < word.length(); i++) {

            char charecter = word.charAt(i);

            switch (charecter) {
                case 'a':
                    countOfA++;
                    count++;
                    break;
                case 'e':
                    countOfE++;
                    count++;
                    break;

                case 'i':
                    countOfI++;
                    count++;
                    break;

                case 'o':
                    countOfO++;
                    count++;
                    break;

                case 'u':
                    countOfU++;
                    count++;
                    break;
            }

        }

        System.out
                .println("a: " + countOfA + " - " + "e: " + countOfE + " - " + "i: " + countOfI + " - " + "o: "
                        + countOfO
                        + " - " + "u:" + countOfU);

        return (count);

    }

    public static void reverseAString(String word) {

        char[] result = new char[word.length()];

        for (int i = word.length() - 1; i >= 0; i--) {

            result[word.length() - 1 - i] = word.charAt(i);

        }

        String value = new String(result);

        System.out.println(value);

        if (value.equals(word)) {
            System.out.println("The given string is palindrom");
        }

    }

    public static void changeFirstCharToUppercase(String word) {

        char[] charArr = word.toCharArray();

        int ascii = (int) charArr[0];

        if (ascii >= 97 && ascii <= 122) {
            charArr[0] = (char) (charArr[0] - 32);
        } else if (ascii >= 65 && ascii <= 90) {
            System.out.println("The char is in Uppercase");
            return;
        } else {
            System.out.println("The first charecter is not alphabet");
            return;
        }

        String value = new String(charArr);

        System.out.println(value);
    }

    public static void changeEvenLetterToUpperCase(String word) {

        char[] data = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            int ascii = (int) data[i];
            if (i % 2 != 0) {
                if (ascii >= 97 && ascii <= 122) {
                    data[i] = (char) (data[i] - 32);
                } else if (ascii >= 65 && ascii <= 90) {
                    return;
                } else {
                    return;
                }
            }
        }

        String value = new String(data);

        System.out.println(value);
    }

    public static void main(String[] args) {

        String word = "malayalam";
        // char given = 'i';

        // System.out.println("The count of repeated first string is : " +
        // countOfFirstChar(word));

        // System.out
        // .println("The count of given charecter '" + given + "' string is : " +
        // countOfGivenChar(word, given));

        // System.out.println("The count of vowels present in given word is : " +
        // findCountOfVowels(word));

        // reverseAString(word);

        // changeFirstCharToUppercase(word);
        changeEvenLetterToUpperCase(word);
    }

}
