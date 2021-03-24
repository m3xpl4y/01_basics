package at.tamasanu.campus.games;

import at.tamasanu.campus.classes.TicTacToeClass;

import java.util.Scanner;

public class TicTacToe {
    static Scanner sc = new Scanner(System.in);
    static int x;
    static int y;

    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("              Tic Tac Toe");
        System.out.println("*****************************************");
        TicTacToeClass.ticTacToeMenu();
        fillGameArr();
        int mySelection = sc.nextInt();
        switch (mySelection)
        {
            case 1: gameTicTacToe();
            break;
            case 2: MainMenu.main(args);
            break;
            default:
                System.out.println("Echt jetzt?");
        }
    }
    static void gameTicTacToe()
    {
        try{
            while(true) {
                boolean isValid = false;
                while (!isValid) {
                    System.out.println("Spieler " + TicTacToeClass.player +"! Bitte die Koordinaten eingeben: (mit Komma getrennt)");
                    String input = sc.next();
                    String[] values = input.split(",");
                    x = Integer.parseInt(values[0]);
                    y = Integer.parseInt(values[1]);
                    if (TicTacToeClass.gameArray[x][y] == ' ') {
                        isValid = true;
                    } else {
                        System.out.println("Dieses Feld ist bereits belegt! Bitte einen anderen Wählen");
                    }
                    checkPlayer();
                    System.out.println("x = " + x + "  " + "y = " + y);
                    fieldArray();
                }
                TicTacToeClass.checkForWin();
                TicTacToeClass.changePlayer();
            }
        }
        catch (Exception e)
        {
            System.out.println("Musste das sein?");
        }
    }

    static void fillGameArr()
    {
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                TicTacToeClass.gameArray[i][j] = ' ';
            }
        }
    }
    static void fieldArray()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + TicTacToeClass.gameArray[i][j]);
            }
            System.out.println("|");
        }
    }
    static void checkPlayer()
    {
        if(TicTacToeClass.player == 1)
        {
            TicTacToeClass.gameArray[x][y] = 'X';
        }
        else
        {
            TicTacToeClass.gameArray[x][y] = 'O';
        }
    }
}
