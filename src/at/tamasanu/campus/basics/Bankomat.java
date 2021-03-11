package at.tamasanu.campus.basics;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;

        while(true)
        {
            showMenu();
            int mySelection = sc.nextInt();

            switch (mySelection){
                case 1:
                    System.out.println("Sie haben Einzahlen ausgewählt");
                    System.out.println("Bitte Betrag Eingeben:");
                    double payIn = sc.nextDouble();
                    if(payIn < 0)
                    {
                        System.out.println("Bitte gültigen Betrag Eingeben");
                        payIn = 0;
                    }
                    else
                    {
                        System.out.println("Ihr Eingegebener Betrag ist: " + payIn + " €");
                    }
                    balance = balance + payIn;
                    break;
                case 2:
                    System.out.println("Sie haben Auszahlung ausgewählt");
                    System.out.println("Bitte Betrag auswählen:");
                    double payOut = sc.nextDouble();
                    if(payOut <= balance)
                    {
                        balance = balance - payOut;
                    }
                    else
                    {
                        System.out.println("Leider nicht genug Geld auf Ihrem Konto vorhanden!");
                        System.out.println("Ihr maximal abhebbarer Betrag beträgt: " + balance + " €");
                    }
                    System.out.println("Ihr aktueler Kontostand lautet: " + balance);
                    break;
                case 3:
                    System.out.println("Sie haben Kontostand ausgewählt");
                    System.out.println("Ihr Kontostand beträgt: " + balance + " €");
                    break;
                case 4: System.exit(0);
                    break;
                default:
                    System.out.println("Bitte eins der Menüpunkte auswählen!");
                    break;
            }

        }

    }
    private static void showMenu()
    {
        String[] menu = {"1. Einzahlen", "2. Auszahlen", "3. Kontostand", "4. Beenden"};
        System.out.println("Wählen Sie aus folgenden Möglichkeiten:");

        for (int i = 0; i < menu.length; i++)
        {
            System.out.println(menu[i]);
        }
    }
}
