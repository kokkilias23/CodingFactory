package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Οριζει δυο μεθοδους, τις isEven και
 * isOdd για τον ελεγχο ενος ακεραιου
 * αν ειναι αρτιος ή περιττος.
 */

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean numeratik = false;

        System.out.println("Δωστε αριθμό");
        num = scanner.nextInt();

        numeratik = isEven(num);

        if (numeratik) {
            System.out.println("O αριθμός " + num + " είναι άρτιος");
        } else {
            System.out.println("O αριθμός " + num + " είναι περιττός");
            }

        }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static boolean isOdd(int a) {
        return !isEven(a);
}
}
