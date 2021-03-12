package at.tamasanu.campus.basics;

import java.util.Arrays;
import java.util.Random;

public class ArraysAufgabe3Sorting {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            int rndNumb = rnd.nextInt(45);
            intArray[i] = rndNumb;
            System.out.println(intArray[i]);
        }
        //Möglichkeit 1:
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        //Möglichkeit 2:
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}
