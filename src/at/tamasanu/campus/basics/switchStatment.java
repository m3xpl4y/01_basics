package at.tamasanu.campus.basics;

import java.util.Random;

public class switchStatment {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(11 - 5) + 5;
        System.out.println(randomNumber);


        switch (randomNumber) {
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            default:
                System.out.println("Try again later! ;-)");

        }
        // Erstelle eine Zufallszahl zwischen 5 und 10

        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.

    }
}
