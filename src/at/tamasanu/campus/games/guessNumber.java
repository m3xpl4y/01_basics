package at.tamasanu.campus.games;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);


        int guessNumb = rnd.nextInt(100);
        //System.out.println(guessNumb);
        boolean isTrue = true;
        while(isTrue)
        {
            System.out.println("Eine Zahl zwischen 0 - 100 eingeben:");
            String s = sc.nextLine();
            int i = Integer.parseInt(s);

            if(guessNumb == i)
            {
                System.out.println("***GEWONNEN***");
                isTrue = false;
            }
            else if(guessNumb < i)
            {
                System.out.println("Zu hoch geschätzt... weiter schätzen!");
                isTrue = true;
            }
            else if(guessNumb > i)
            {
                System.out.println("Zu niedrig geschätzt... weiter schätzen!");
                isTrue = true;
            }

        }

    }
}
