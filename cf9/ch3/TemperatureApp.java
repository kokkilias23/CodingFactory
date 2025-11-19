package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 *
 * O  User εισαγει εναν ακεραιο που συμβολιζει μια διαδικασια
 * αν το προγραμμα υπολογιζει αν η θερμοκρασια ειναι μικροτερη
 * απο το 0 μηδεν τοτε μια μεταβλητη γινεται true αλλιως γινεται false
 *
 */
public class TemperatureApp {
    public static void main(String[] args) {
        boolean isSubZero = true;
        int temperature = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλω εισαγεται θερμοκρασια: \n");
        temperature = scanner.nextInt();

        isSubZero = temperature < 0;


        if (isSubZero == true) {
            System.out.printf("Η θερμοκρασια ειναι κατω απο το 0");

        }

        if (isSubZero != true){
            System.out.printf("Η θερμοκρασια ειναι πανω απο το 0");
        }
    }
}
