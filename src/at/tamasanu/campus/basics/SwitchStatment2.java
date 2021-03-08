package at.tamasanu.campus.basics;
import java.util.Scanner;

public class SwitchStatment2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie Ihre Note ein:");
        int note = sc.nextInt();
        switch (note) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Genügend");
                break;
            case 5:
                System.out.println("Nicht Genügend");
                break;
            default:
                System.out.println("Bitte eine Gültige Note eingeben, zwischen 1 und 5");
                break;
        }
    }


//        Erstelle eine Variable welche eine numerische
//        Schulnote beinhaltet und mit Hilfe eines
//        switch/case diese dann textuell ausgibt. Versuche
//        auf zwei Varianten die Note < 1 und Noten größer 5
//        zu behandeln.
//        z.B.
//                Input: 1
//        Output: sehr gut


//        Drehe das vorher geschriebene Programm um, so das die
//        Eingabe der Text ist und die Ausgabe die Ziffernnote.
//                Hinweis: Die textuelle Eingabe kann in der Praxis
//“irgendwie” daher kommen (z.B. “seHR gut”, “sehr gut”,
//“SEHR GUT”, …), überlege oder google nach einer
//        Möglichkeit auf dieses zu reagieren (Stichwort: lowerCase,
//                upperCase).

}
