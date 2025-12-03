package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;
import java.util.*;

/**
 * Count the number of positive numbers.
 * How many loops will be need is a case that
 * happens @runtime.
 */
public class PositivesCountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        int positives = 0;

        System.out.println("please enter a number");
        num = scanner.nextDouble();

        //Διαβάζει μέχρι να βρεί αρνητικό ακέραιο (sentinel)
        while (num >= 0) {
            positives++;
            System.out.println("Please enter the number: ");
            num = scanner.nextDouble();

        }

        System.out.println("The count of positive numbers is :" + positives);

    }
}
