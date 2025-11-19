package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculate factorial of a number.
 * n! = 1 * 2 * 3 * ... * n
 */
public class FactorialApp {

    public static void main(String[] args) {

        // Αρχικοποίηση Δεδομένων
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        long result = 1;
        int i = 1;

        // Είσοδος Δεδομένων και αντιστοίχηση σε μεταβλητές
        System.out.printf("Παρακαλώ εισάγεται τον αριθμό");
        n = scanner.nextInt();

        //Εκτέλεση εντολών

        while (i <= n){
            result *= i;
            i++;
        }

        System.out.printf("%d! = %d\n", n, result);


    }
}
