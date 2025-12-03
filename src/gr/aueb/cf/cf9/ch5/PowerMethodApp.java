package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 *
 * Υπολογιζει τη δυναμη a^b με μέθοδο
 */

public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBase = 0;
        int numPower = 0;
        int result = 0;

        System.out.println("Δωστε πρωτα βαση και υστερα εκθετη: ");
        numBase = scanner.nextInt();
        numPower = scanner.nextInt();

        result = factPower(numBase, numPower);
        System.out.println("Το αποτέλεσμα του: " + numBase + "^" + numPower + " ειναι: " + result);
    }

    public static int factPower(int a, int b) {
        int result = 1;

        for(int i = 1; i <= b;i++) {
            result *= a;

        }
        return result;
    }
}
