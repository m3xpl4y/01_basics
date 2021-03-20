package at.tamasanu.campus.classes;

public class TicTacToeClass {

    public static int player = 1;
    public static char[][] gameArray = new char[3][3];

    public static void changePlayer()
    {
        if(player == 1)
        {
            player = 2;
        }else {
            player = 1;
        }
    }
    public static void checkForWin()
    {
        //X.264 O.237 Gewinnzahlen
        int Win1 = gameArray[0][0] + gameArray[0][1] + gameArray[0][2]; //erste reihe horizontal
        int Win2 = gameArray[1][0] + gameArray[1][1] + gameArray[1][2]; //zweite reihe horizontal
        int Win3 = gameArray[2][0] + gameArray[2][1] + gameArray[2][2]; //dritte reihe horizontal
        int Win4 = gameArray[0][0] + gameArray[1][0] + gameArray[2][0]; //erste reihe vertical
        int Win5 = gameArray[0][1] + gameArray[1][1] + gameArray[2][1]; //zweite reihe vertical
        int Win6 = gameArray[0][2] + gameArray[1][2] + gameArray[2][2]; //dritte reihe vertical
        int Win7 = gameArray[0][0] + gameArray[1][1] + gameArray[2][2]; //links oben rechts unten
        int Win8 = gameArray[0][2] + gameArray[1][1] + gameArray[2][0]; //rechts oben links unten
//        System.out.println("xWin1 " + Win1);
//        System.out.println("xWin2 " + Win2);
//        System.out.println("xWin3 " + Win3);
//        System.out.println("xWin4 " + Win4);
//        System.out.println("xWin5 " + Win5);
//        System.out.println("xWin6 " + Win6);
//        System.out.println("xWin7 " + Win7);
//        System.out.println("xWin8 " + Win8);
        int xWin = 264;
        int oWin = 237;

        if(Win1 == xWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        else if(Win1 == oWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        if(Win2 == xWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        else if(Win2 == oWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        if(Win3 == xWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        else if(Win3 == oWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        if(Win4 == xWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        else if(Win4 == oWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        if(Win5 == xWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        else if(Win5 == oWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        if(Win6 == xWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        else if(Win6 == oWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        if(Win7 == xWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        else if(Win7 == oWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        if(Win8 == xWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
        else if(Win8 == oWin)
        {
            System.out.println("Spieler " + player + " hat gewonnen");
            ticTacToeMenu();
        }
    }
    public static void ticTacToeMenu()
    {
        String[] menu = {"1. Spiel starten", "2. Beenden"};
        System.out.println("*****************************************");
        System.out.println("Wählen Sie aus folgenden Möglichkeiten:");
        System.out.println("*****************************************");

        for (int i = 0; i < menu.length; i++)
        {
            System.out.println(menu[i]);
            System.out.println("------------------------------");
        }
    }
}
