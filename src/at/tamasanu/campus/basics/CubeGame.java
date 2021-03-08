package at.tamasanu.campus.basics;

import java.util.Random;
import java.util.Scanner;

public class CubeGame
{
    private static String playerName;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner scanName = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("           Würfelspiel");
        System.out.println("************************************");
        System.out.println("Geben Sie Ihren Namen ein:");
        playerName = scanName.nextLine();
        System.out.println("Hallo "+ playerName);
        while(true)
        {
            m_menu();
            int mySelection = sc.nextInt();
            switch (mySelection)
            {
                case 1: Game();

                    break;
                case 2: System.exit(0);
                    break;
                default:
                    System.out.println("Bitte einen gültigen Menüpunkt auswählen");
                    break;
            }
        }


    }
    public static void m_menu()
    {
        String[] menu = {"1. Spiel Starten", "2. Beenden"};
        System.out.println("Wähle aus folgenden Möglichkeiten:");

        for (int i = 0; i < menu.length; i++)
        {
            System.out.println("----------------------------------");
            System.out.println(menu[i]);
        }
    }
    public static void Game()
    {
        Random random = new Random();

        boolean p1WinNumb;
        boolean p1LoseNumb;
        boolean p2WinNumb;
        boolean p2LoseNumb;

        int playerOne = random.nextInt(6 - 0) + 1;
        System.out.println("Computer hat " + playerOne +" geworfen");

        int playerTwo = random.nextInt(6 - 0) + 1;
        System.out.println(playerName +" hat " + playerTwo +" geworfen");

        p1WinNumb = playerOne == 6;
        p1LoseNumb = playerOne < 6;

        p2WinNumb = playerTwo == 6;
        p2LoseNumb = playerTwo < 6;



        if(p1WinNumb && p2WinNumb)
        {
            System.out.println("Spiel ist unentschieden!");
        }
        else if(p2WinNumb && p1LoseNumb)
        {
            System.out.println(playerName + " hat Gewonnen!");
        }
        else if(p1WinNumb && p2LoseNumb)
        {
            System.out.println("Computer hat gewonnen!");
        }
        else if(p1LoseNumb && p2LoseNumb)
        {
            System.out.println("Keiner hat gewonnen!");
        }

    }

}
