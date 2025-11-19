package gr.aueb.cf.cf9.ch3;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

/**
 * the user inserts the temperature in Celcius , and the status of isRaining
 * variable and calculates if it is snowing or not. If it is raining and the
 * temperature is below 0, it is snowing.
 */

public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Παρακαλω εισαγετε αν βρεχει (true/false)");
        isRaining = scanner.nextBoolean();
        System.out.println("Παρακαλω εισαγετε τη θερμοκρασια");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0);
        System.out.println("is Snowing " + isSnowing);
    }
}
