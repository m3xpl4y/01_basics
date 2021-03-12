package at.tamasanu.campus.basics;


import java.util.HashMap;
import java.util.Map;

public class Quersummen {
    public static void main(String[] args) {
        int sum = 0;
        int startNr = 1;
        int endNr = 1000;
        int[][] testArray = new int[startNr][endNr];

        for (int j = 1; j < 1000; j++) {
            String s = Integer.toString(j);

            //int numbLength = s.length();
            int[] numbArray = new int[s.length()];
            sum = 0;

            for (int i = 0; i < s.length(); i++) {
                numbArray[i] = Character.getNumericValue(s.charAt(i));
                sum = sum + numbArray[i];
            }
            testArray[sum][0] = sum;

        }

        //System.out.println(sum);
        //System.out.println("Quersummer von " +j );

//            if(sum == 15)
//            {
//                System.out.println("Die Quersummer von " + j + " ist " + sum);
//            }

//            if(sum % 7 == 0)
//            {
//                System.out.println("Aufgabe Quersumme 2: " + sum);
//            }

    }
}


