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

}
