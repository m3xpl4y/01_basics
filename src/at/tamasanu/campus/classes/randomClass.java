package at.tamasanu.campus.classes;

import java.util.Random;

public class randomClass {

    public static boolean isPrimumber(int primNumber) {
        boolean isPrimNumber = true;
        int divider = 2;
        double resultNumb = primNumber % divider;
        boolean exit = true;
        while (exit)
        {
            if (resultNumb == 0)
            {
                System.out.println("Es ist keine Primzahl");
                isPrimNumber = false;
                exit = false;
            }
            else if ((divider * divider) > primNumber)
            {
                System.out.println("Es ist eine Primzahl");
                isPrimNumber = true;
                exit = false;
            }
            divider += 1;

        }
        return isPrimNumber;
    }
    public static void isDivisible(double number)
    {
                int divider = 3;

                if(number % divider == 0)
                {
                    System.out.println("Die Zahl lässt sich durch 3 teilen");
                }
                else
                {
                    System.out.println("Die Zahl lässt sich NICHT durch 3 teilen");
                }
    }
    public static int calcSum(int numbOne, int numbTwo)
    {
        int sum = 0;

        for (numbOne = numbOne; numbOne < numbTwo; numbOne++) {
            sum = sum + numbOne;
        }

        return sum;
    }
    public static int randomNumber ( int number)
    {
        Random rnd = new Random();
        number = rnd.nextInt(500-100) +100;
        return number;
    }

}
