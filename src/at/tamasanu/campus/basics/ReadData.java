package at.tamasanu.campus.basics;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class ReadData {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein: ");
        double num1 = scan.nextDouble();

        System.out.println("Geben Sie die zweite Zahl ein: ");
        double num2 = scan.nextDouble();

        double result = num1 + num2;

        System.out.println("Die Summe Ihrer Eingegebenen Zahlen ist: " + result);
    }

}
