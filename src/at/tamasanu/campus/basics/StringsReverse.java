package at.tamasanu.campus.basics;

import at.tamasanu.campus.classes.StringHelper;

public class StringsReverse {
    public static void main(String[] args) {

        String name1 = "aaaaalölömvkmäödlsäölfvvv";
        //String name2 = new StringBuilder(name1).reverse().toString();

        System.out.println(new StringBuilder(name1).reverse().toString());
        System.out.println(StringHelper.reverseString(name1));
        System.out.println(StringHelper.countLetters(name1));
        System.out.println(StringHelper.isPalindrome(name1));


        char[] charArray = new char[name1.length()];
        int[] intArray = new int[name1.length()];
        for (int i = 0; i < charArray.length; i++) {
            char strChar = name1.charAt(i);
                charArray[i] = strChar;
            //System.out.println(strChar);
            int frequency = 0;
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == charArray[i])
                {
                    frequency++;
                    intArray[j] = frequency;
                }
                else
                {
                    continue;
                }
            }
            System.out.printf("%s : %d", charArray[i], intArray[i]);
            System.out.println();
            //System.out.println(charArray[i] +" - " + intArray[i]);
        }
    }
}
