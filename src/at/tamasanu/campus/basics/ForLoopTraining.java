package at.tamasanu.campus.basics;

import java.util.Scanner;

public class ForLoopTraining {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int num;
//
//        System.out.println("Enter a number: ");
//        num = sc.nextInt();
//
//        System.out.println("Multiplication Table of " + num);
//
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.println(num + " x " + i + " = " + (num*i));
//        }

        Scanner sc = new Scanner(System.in);

        int base = 5;
        int power = 2;
        int result = 1;

//        System.out.println("Base Nummer Eingeben:");
//        base = sc.nextInt();
//
//        System.out.println("Power Nummer Eingeben:");
//        power = sc.nextInt();

        for (int i = 1; i <=power ; i++) {
            result = result * base;
            System.out.println("Result: Bis zum Endbetrag " + result);
        }
        System.out.println("Result: " + result);
    }
}
