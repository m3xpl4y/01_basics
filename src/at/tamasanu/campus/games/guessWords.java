package at.tamasanu.campus.games;


import java.util.Arrays;
import java.util.Scanner;
import at.tamasanu.campus.classes.guessWordsClasses;


public class guessWords {
    static Scanner scn = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    static String[] rndWordArray = new String[] {"Zwei","besten","Ansicht","endlich","Stelle","direkt","Beim","Bevölkerung","Viele","solchen","Alle","jungen","Einsatz","richtig","größte","sofort","neuer","ehemaligen","unserer","dürfte","schaffen","Augen","Rußland","Internet","Allerdings","Raum","Mannschaft","neun","kamen","Ausstellung","Zeiten","einzige","meine","Verfahren","Angebot","Richtung","Projekt","niemand","Kampf","weder","tatsächlich","Personen","Heute","geführt","Gespräch","Kreis","Hamburger","Schule","guten","Hauptstadt","durchaus"};
    static String choosenWord = guessWordsClasses.getRandomWord(rndWordArray);
    static String[] stringChoosenWord = new String[choosenWord.length()];
    static String input = "";
    static String[] charString = new String[choosenWord.length()];
    static String toLowerCaseChosenWord = choosenWord.toLowerCase();

    public static void main(String[] args) {

        System.out.println("*****************************************");
        System.out.println("              Wörter Raten");
        System.out.println("*****************************************");
        guessWordsClasses.guessWordsMenu();

        int mySelection = sc.nextInt();
        switch (mySelection)
        {
            case 1:
                firstWordLoops();
                while(true)
                {
                System.out.println(choosenWord); //Gibt ein Zufälliges Wort aus dem Array aus. Kommetieren um das gesuchte Wort nicht mehr anzuzeigen!

                System.out.println("Bitte einen Buchstaben auswählen");
                mainGame();
                    if(Arrays.asList(stringChoosenWord).contains(input))
                    {
                        System.out.println("Buchstabe " + input.toUpperCase() + " ist vorhanden");
                    }
                    else
                    {
                        System.out.println("Buchstabe " + input.toUpperCase() + " ist NICHT vorhanden");
                    }
                    if(choosenWord.equalsIgnoreCase(String.join("",charString)))
                    {
                        System.out.println("Sie haben gewonnen");
                        break;
                    }
                }
                break;
            case 2: MainMenu.main(args);
                break;
            default:
                System.out.println("Echt jetzt?");
        }
    }
    static void firstWordLoops()
    {
        for (int i = 0; i < choosenWord.length(); i++) {
            stringChoosenWord[i] = Character.toString(toLowerCaseChosenWord.charAt(i));
        }
        String starStr = "*";
        for (int i = 0; i < choosenWord.length(); i++) {
            charString[i] = starStr;
        }
    }
    static void mainGame()
    {
        input = scn.nextLine();
        if (String.join("", charString).contains("*")) {
            for (int i = 0; i < choosenWord.length(); i++) {
                if (Character.toString(choosenWord.charAt(i)).equalsIgnoreCase(input)) {
                    charString[i] = input;
                }
            }
        }
        System.out.println("Result, Buchstabe mit Sterne: " + String.join("",charString));
    }
}
