package gr.aueb.cf.cf9.review_challenges;

import java.util.Scanner;

/**
 * Γράψτε μια μέθοδο που επιστρέφει τον n-οστό
 * αριθμό Fibonacci (0, 1, 1, 2, 3, 5, 8, ...).
 *
 * Παράδειγμα
 * Είσοδος: n = 0
 * Έξοδος: 0
 *
 * Είσοδος: n = 5
 * Έξοδος: 5
 *
 * Είσοδος: n = 7
 * Έξοδος: 13
 */

public class Fibonacci {
    public static void main(String[] args) {
        int nara = 0;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        while (10 > nara) {
        try {
            System.out.println("Δώσε αριθμό n:");
            nara = scanner.nextInt();

            result = fibonacci(nara);
            System.out.println("Fibonacci(" + nara + ") = " + result);
        } catch (IllegalAccessException e) {
            System.out.println("Σφάλμα: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Λάθος είσοδος. Δώσε ακέραιο αριθμό.");
        }
    }
        scanner.close();
        }

        public static int fibonacci ( int n) throws IllegalAccessException {
            int a = 0;
            int b = 1;
            int fibo = 1;


            if (n < 0) throw new IllegalAccessException("Το n δεν μπορεί να είναι αρνητικό");

            if (n == 0) return a;
            if (n == 1) return b;

            for (int i = 2; i <= n; i++) {
                fibo = a + b;
                a = b;
                b = fibo;
            }
            return fibo;

        }
    }

