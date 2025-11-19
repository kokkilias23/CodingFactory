package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * θα προσθέτουμε κιλά και θα τα μετατρέπει σε γραμμάρια
 */

public class GrammsToKiloApp {

    public static void main(String[] args) {


        // Δήλωση μεταβλητών
        Scanner scanner =  new Scanner(System.in);
        final int Gramms_In_Kilos = 1000;
        int InputKilos = 0;
        int GrammsInKilos = 0;

        // Εντολές
        System.out.println("Παρακαλώ εισάγετε τα κιλά:");
        InputKilos = scanner.nextInt();
        GrammsInKilos = InputKilos * Gramms_In_Kilos;

        // Αποτελέσματα
        System.out.printf("Τα γραμμάρια των κιλών που δώσατε ειναι: %,d", GrammsInKilos);


    }
}
