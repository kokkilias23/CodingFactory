package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογιζει το παραγοντικο του n,
 * με μεθοδο. Το n! = 1 * 2 * 3 *...* n
 * Και 0! = 1
 */

public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int numParag = 0;

        System.out.println("Δωστε αριθμο: ");
        num1 = scanner.nextInt();

        numParag = facto(num1);
        System.out.println("Το παραγωγικο του αριθμου: " + num1 + " ειναι " + numParag);



    }

    public static int facto(int n) {
        int result = 1;

        for(int i = 1; i <= n;i++) {
            result *= i;

        }
        return result;
    }
}
