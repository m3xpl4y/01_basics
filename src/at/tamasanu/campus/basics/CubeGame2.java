package at.tamasanu.campus.basics;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class CubeGame2 {

    private static String playerName;
    private static int playerOne = 0;
    private static int playerTwo = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scanName = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("           Würfelspiel");
        System.out.println("************************************");
        System.out.println("Geben Sie Ihren Namen ein:");
        playerName = scanName.nextLine();
        System.out.println("Hallo " + playerName);
        while (true) {
            cube_menu();
            int mySelection = sc.nextInt();

            switch (mySelection) {
                case 1: Game();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bitte einen gültigen Menüpunkt auswählen");
                    break;
            }
        }
    }
    private static void Game()
    {
        Random random = new Random();
        int playerOneSum = 0;
        int playerTwoSum = 0;

        for (int i = 0; i < 6; i++) {
            playerOne = random.nextInt(6 - 0) + 1;
            playerOneSum = playerOneSum + playerOne;
            //System.out.println(playerOne);
        }
        System.out.println("---------------------------------");
        System.out.println("Der Computer hat die Augensumme " + playerOneSum);

        for (int i = 0; i <= 6; i++) {
            playerTwo = random.nextInt(6 - 0) + 1;
            playerTwoSum = playerTwoSum + playerTwo;
        }
        System.out.println("---------------------------------");
        System.out.println("Die Augensumme der Würfel von "+ playerName+ " ist " +playerTwoSum);
        System.out.println("---------------------------------");

        if(playerOneSum == playerTwoSum)
        {
            System.out.println("********************");
            System.out.println("Spiel ist unentschieden!");
            System.out.println("********************");
        }
        else if(playerTwoSum > playerOneSum)
        {
            System.out.println("********************");
            System.out.println(playerName + " hat Gewonnen!");
            System.out.println("********************");
        }
        else if(playerTwoSum < playerOneSum)
        {
            System.out.println("********************");
            System.out.println("Computer hat gewonnen!");
            System.out.println("********************");
        }

    }
    private static void cube_menu()
    {
        String[] menu = {"1. Spiel Starten", "2. Beenden"};
        System.out.println("Wähle aus folgenden Möglichkeiten:");

        for (int i = 0; i < menu.length; i++)
        {
            System.out.println("----------------------------------");
            System.out.println(menu[i]);
        }
    }
}
