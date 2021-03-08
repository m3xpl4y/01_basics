package at.tamasanu.campus.basics;

import java.util.Random;
import java.util.Scanner;

public class ifStatment {

    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
        // Gib die Zufallszahl aus
        if (randomNumber < 20) {
            System.out.println("Mini");
        } else if (randomNumber >= 20 && randomNumber <= 50) {
            System.out.println("Medium");
        } else {
            System.out.println("Large");
        }
        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine beliebige Zahl ein zwischen 0 und 100:");
        double num1 = sc.nextDouble();
        if (num1 > 75) {
            System.out.println("High Average");
        } else if (num1 >= 25 && num1 <= 75) {
            System.out.println("Medium Average");
        } else {
            System.out.println("Viel zu klein!");
        }

    }

}
