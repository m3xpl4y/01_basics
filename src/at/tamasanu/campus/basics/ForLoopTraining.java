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
        int num;
        int fact = 1;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact *= i;
            //fact = fact * i;
            System.out.println("Factorial_alle_zahlen: " + fact);
        }
        System.out.println("Factorial: " + fact);
    }
}
