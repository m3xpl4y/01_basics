package at.tamasanu.campus.basics;

import java.util.Scanner;

public class ArraysAufgabe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[10];
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Bitte Zahl Nr."+i+ " eingeben:");
            intArray[i] = sc.nextInt();
            sum = sum + intArray[i];
        }
        System.out.println("Die Summe des Arrays ist: " +sum);
    }
}
