package at.tamasanu.campus.basics;

import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {

        Random random = new Random();

        boolean isFinished = false;
        int sum = 0;

        while (!isFinished) {
            int randomNumber = random.nextInt(30 - 10) + 10;
            System.out.println("NR.: " + randomNumber);
            sum = sum + randomNumber;


            if (randomNumber == 15 || randomNumber == 25)
            {
                sum = sum - randomNumber;
                isFinished = true;
                System.out.println("Bedienung Stimmt!");
                System.out.println("Gesamtergebnis: " + sum);

            }
        }

    }
}
