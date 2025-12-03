package gr.aueb.cf.cf9.ch3;

import gr.aueb.cf.cf9.ch5.AddApp;

import java.util.Scanner;

/**
 *  Ο χρήστης εισάγει δύο τιμές, αριθμητή και
 *  παρανομαστή και το πρόγραμμα υπολογίζει το
 *  πηλίκο, επαναληπτικα.
 *
 *  Αν ο αριθμητης ειναι 0 τοτε το προγραμμα διακοπτεται
 *  Αν ο παρονομαστης ειναι 0, τοτε η διαδικασια επαναλαμβανεται.
 */

public class DivisionApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;
        int resultAdd = 0;

        while (true) {
            System.out.println("Please enter a numerator: ");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("diakoptete to programma");
                break;
            }

            System.out.println("Please enter a denominator: ");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Can not dived by zero");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result: " + result);
            break;
        }
        resultAdd = AddApp.add(numerator, denominator);
        System.out.println("Και το αθροισμα αυτων ειναι: " + resultAdd);

    }
}
