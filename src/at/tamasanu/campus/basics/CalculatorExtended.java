package at.tamasanu.campus.basics;

import java.util.Scanner;

public class CalculatorExtended {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 3;
        int input1 = sc.nextInt();
        result = result + input1;

        System.out.println("Ergebnis: " +result);
    }
}
