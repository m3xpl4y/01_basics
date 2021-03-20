package at.tamasanu.campus.games;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            showMenu();
            int mySelection = sc.nextInt();

            switch (mySelection) {
                case 1:
                    guessWords.main(args);
                    break;
                case 2:
                    CubeGame2.main(args);
                    break;
                case 3:
                    TicTacToe.main(args);
                    break;
                case 4:
                    System.out.println("Leider ist diese Spiel auch noch nicht fertig, bitte mehr Spenden um es schneller fertig zu haben!");
                    break;
                case 5:
                    System.out.println("Diese Spiel ist auch noch nicht fertig!");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Echt jetzt? Kannst nicht eine Zahl von 1 - 6 auswählen?");
            }
        }
    }
    private static void showMenu()
    {
        String[] menu = {"1. Wörter erraten Spiel", "2. Würfelspiel", "3. Tic Tac Toe", "4. Hangman", "5. 4 Gewinnt", "6. Beenden"};
        System.out.println("*****************************************");
        System.out.println("***************SPIELMENÜ*****************");
        System.out.println("*****************************************");
        System.out.println("*Wählen Sie aus folgenden Möglichkeiten:*");
        System.out.println("*****************************************");
        for (int i = 0; i < menu.length; i++)
        {
            System.out.println(menu[i]);
            System.out.println("---------------------------");
        }
    }
}
