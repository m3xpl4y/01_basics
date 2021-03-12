package at.tamasanu.campus.basics;

import java.util.Random;

public class ArraysAufgabe2 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int[] intArray = new int[50];
        int sum = 0;


        for (int i = 0; i < intArray.length; i++) {
            int rndNumb = rnd.nextInt(100);
            intArray[i] = rndNumb;

            sum = sum + intArray[i];

        }
        System.out.println(sum);
    }
}
