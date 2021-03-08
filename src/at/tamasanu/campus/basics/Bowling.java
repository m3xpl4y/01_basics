package at.tamasanu.campus.basics;

import java.util.Random;
import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = random.nextInt(9 - 0) + 1;
        String answer = "j";
        String answer2 = "J";
        String restart = "j";

        while (true) {
            switch (randomNumber) {
                case 1, 2, 3:
                    System.out.println("Okay");
                    break;
                case 4, 5, 6:
                    System.out.println("Guter Wurf");
                    break;
                case 7, 8:
                    System.out.println("Sehr guter Wurf");
                    break;
                case 9:
                    System.out.println("Perfekt!");
                    break;
            }
            if (answer.equals(restart) || answer2.equals(restart))
            {
                System.out.println("Nochmal? (J/N)");
                restart = sc.nextLine();
            }
            else
            {
                System.exit(0);
            }
        }
    }
}
//    Versuche mit einem switch/case folgendes abzubilden:
//        Im Bowling gibt es 9 Kegel, versuchen wir die Würfe zu kategorisieren:
//        1 - 3 getroffene = okay
//        4 - 6 getroffene = guter Wurf
//        7 - 8 getroffene = sehr guter Wurf
//        9 getroffene = Perfekt!
//        Achtung: case - Blöcke können zusammengefasst werden :)