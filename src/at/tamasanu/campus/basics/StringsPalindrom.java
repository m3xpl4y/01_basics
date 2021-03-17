package at.tamasanu.campus.basics;

import at.tamasanu.campus.classes.StringHelper;

import java.util.Scanner;

public class StringsPalindrom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Name eingeben: ");
        String name1 = sc.nextLine();
        String name2 =  new StringBuilder(name1).reverse().toString();


        System.out.println(isPalindrome(name1, name2));
        System.out.println("Externe Klasse: " + StringHelper.isPalindrome(name1));

    if(name1.equalsIgnoreCase(name2))
        {
            System.out.println("Die Namen stimmen überein! " + name1 + " " + name2);
        }
        else
        {
            System.out.println("Die Namen stimmen nicht überein! " + name1 + " " + name2);
        }
    }
    public static boolean isPalindrome(String word, String word2) {
        if (word.equalsIgnoreCase(word2))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
