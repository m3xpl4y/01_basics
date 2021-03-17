package at.tamasanu.campus.basics;

import java.util.Arrays;

public class Quersummen {
    public static void main(String[] args) {
        int sum = 0;
        int[] intArray = new int[1000];
        int[] freqArray = new int [28];

        for (int j = 1; j < 1000; j++) {

            String s = Integer.toString(j);
            int[] numbArray = new int[s.length()];
            sum = 0; //mit jede neue Schleife wird die Summe auf null gesetzt, damit sie korrekt, wieder verwendet wird

            for (int i = 0; i < s.length(); i++) {
                numbArray[i] = Character.getNumericValue(s.charAt(i)); //wird aus einem String die Zahl als int "gemacht"
                sum = sum + numbArray[i]; // mit jede neue Schleife wird die Summe, der Schleife angezeigt
            }
            intArray[j] = sum;

//            System.out.println("Die Quersumme von: "+ s + " ist " + sum);
//            System.out.println("Inhalt intArray: " +intArray[j]);
//            System.out.println("Inhalt intArray: " + Arrays.toString(intArray));

//            if(sum == 15)
//            {
//                System.out.println("Summe: "+ intArray[j] + " --" + sum);
//            }
            freqArray[sum] += 1;

        }
        //
        Arrays.sort(freqArray);
        System.out.println(Arrays.toString(freqArray));
    }
}


