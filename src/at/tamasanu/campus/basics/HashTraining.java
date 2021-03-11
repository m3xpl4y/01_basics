package at.tamasanu.campus.basics;

public class HashTraining {
    public static void main(String[] args) {

        String name1 = "Maximilian";
        String name2 = "maximilian";

        int hashBig = name1.hashCode();
        int hashSmall = name2.hashCode();

        System.out.println("name1: " + hashBig + " name2: " + hashSmall);
    }
}
