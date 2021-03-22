package at.tamasanu.campus.classes;

import java.util.Random;

public class guessWordsClasses {
    
    //Nimmt aus dem Array einen zufälligen Wort heraus und gibt es aus.
    public static String getRandomWord(String[] array)
    {
        Random rnd = new Random();
        int index = rnd.nextInt(array.length);
        return array[index];
    }
    public static void guessWordsMenu()
    {
        String[] menu = {"1. Spiel starten", "2. Beenden"};
        System.out.println("             Bitte wählen:");

        for (int i = 0; i < menu.length; i++)
        {
            System.out.println(menu[i]);
            System.out.println("------------------------------");
        }
    }

}
