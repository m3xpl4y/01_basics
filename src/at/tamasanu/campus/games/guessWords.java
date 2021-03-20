package at.tamasanu.campus.games;


import java.util.Scanner;
import at.tamasanu.campus.classes.guessWordsClasses;


public class guessWords {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String[] rndWordArray = new String[] {"Zwei","besten","Ansicht","endlich","Stelle","direkt","Beim","Bevölkerung","Viele","solchen","Alle","jungen","Einsatz","richtig","größte","sofort","neuer","ehemaligen","unserer","dürfte","schaffen","Augen","Rußland","Internet","Allerdings","Raum","Mannschaft","neun","kamen","Ausstellung","Zeiten","einzige","meine","Verfahren","Angebot","Richtung","Projekt","niemand","Kampf","weder","tatsächlich","Personen","Heute","geführt","Gespräch","Kreis","Hamburger","Schule","guten","Hauptstadt","durchaus"};

        String choosenWord = guessWordsClasses.getRandomWord(rndWordArray);
        System.out.println(choosenWord); //Gibt ein Zufälliges Wort aus dem Array aus.

        String[] stringChoosenWord = new String[choosenWord.length()];
        String[] charString = new String[choosenWord.length()];

        for (int i = 0; i < choosenWord.length(); i++) {
            stringChoosenWord[i] = Character.toString(choosenWord.charAt(i));
        }
        String starStr = "*";
        for (int i = 0; i < choosenWord.length(); i++) {
            charString[i] = starStr;
        }
        while(true) {
            System.out.println("Bitte einen Buchstaben auswählen");
            String input = scn.nextLine();

            if (String.join("", charString).contains("*")) {
                for (int i = 0; i < choosenWord.length(); i++) {
                    if (Character.toString(choosenWord.charAt(i)).equalsIgnoreCase(input)) {
                        charString[i] = input;
                    }
                }
            }

            System.out.println("char string: "+ String.join("",charString));

            if(choosenWord.equalsIgnoreCase(String.join("",charString)))
            {
                System.out.println("Sie haben gewonnen");
                break;
            }


            System.out.println("Result, Buchstabe mit Sterne: " + String.join("",charString));
        }
    }
}
