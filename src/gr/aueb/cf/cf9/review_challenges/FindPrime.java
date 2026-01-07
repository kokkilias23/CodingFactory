package gr.aueb.cf.cf9.review_challenges;

import java.util.Scanner;

/**
 * Γράψτε μια μέθοδο που ελέγχει αν ένας αριθμός είναι πρώτος
 * (δηλαδή διαιρείται μόνο με το 1 και τον εαυτό του).
 */

public class FindPrime {

    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Δώστε αριθμό,");
        System.out.println(" Να ανήκει στους πραγματικους αριθμους:");
        num = sc.nextInt();

        System.out.printf("Num: %d, is %s", num, (isPrime(num) ? "prime" : "not prime" ));
    }


    public static boolean isPrime(int num) {
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
