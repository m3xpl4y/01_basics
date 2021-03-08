package at.tamasanu.campus.basics;


public class FruitCalculator {
    public static void main(String[] args) {
        String fruchtName1 = "Bananen";
        String fruchtName2 = "Apple";

        double bananaPricePerKilo = 2.14;
        double applepricePerKilo = 3.43;

        double bananaGewicht = 0.22;
        double apfelGewicht = 0.34;

        double anzahlBananenPerKilo = 1 / bananaGewicht;
        double anzahlApfelPerKilo = 1 / apfelGewicht;

        double priceProBanane = bananaPricePerKilo / anzahlBananenPerKilo;
        double result_bananen = 17 * priceProBanane;

        double priceProApple = applepricePerKilo / anzahlApfelPerKilo;
        double result_apple = 8 * priceProApple;

        System.out.println("Zuerst: " + fruchtName1);
        System.out.println("In einem KG " + fruchtName1 + " sind " + anzahlBananenPerKilo + " Stück");
        System.out.println("Der Preis pro Stück beträgt: " + priceProBanane);
        System.out.println("Der Preis von 17 Bananen beträgt: " + result_bananen);
        System.out.println("Der Preis von einer Tone Bananen beträgt: " + 1000 * priceProBanane);

        System.out.println("Als nächstes: " + fruchtName2);
        System.out.println("In einem KG " + fruchtName2 + " sind " + anzahlApfelPerKilo + " Stück");
        System.out.println("Der Preis pro Stück beträgt: " + priceProApple);
        System.out.println("Der Preis von 8 Äpfel beträgt: " + result_apple);
        System.out.println("Der Preis von einer Tone Äpfel beträgt: " + 1000 * priceProApple);


        // Ein Apfel hat durchschnittlich ein Gewicht von 0.34 Kilo
        // Eine Banane hat durchschnittlich ein Gewicht von 0.22 Kilo

        // Gib folgendes aus: Anzahl Bananen/Äpfel pro Kilo, Preis pro Banane/Apfel
        // Preis von 8 Äpfeln
        // Preis von 17 Bananen
        // Preis von 1 Tonne Äpfel
        // Preis von 1 Tonne Bananen
    }
}
