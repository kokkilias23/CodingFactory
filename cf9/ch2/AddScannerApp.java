package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Διαβάζει δύο ακεραίους απο το stdin (keyboard)
 * και υπολογίζει το αποτέλεσμα.
 */
public class AddScannerApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum =  0;



        //Εντολές

        System.out.printf("Παρακαλώ εισάγετε δύο ακεραίους %n");
        num1 = scanner.nextInt();
        //System.out.printf("%n");
        num2 = scanner.nextInt();
        sum = num2 + num1;


        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Το αθροισμα των %d και %d ειναι ισο με %d%n", num1, num2, sum);

    }
}
