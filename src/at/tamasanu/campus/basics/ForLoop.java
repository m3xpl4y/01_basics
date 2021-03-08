package at.tamasanu.campus.basics;

public class ForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
            System.out.println("Ergebnis: " + sum);

        }
        int sum2 = 0;
        for (int i = 0; i <= 1000; i = i + 2) {
            sum2 = sum2 + i;
            System.out.println("Ergebnis 2: " + sum2);
        }
    }
}
