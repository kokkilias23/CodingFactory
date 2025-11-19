package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 *  ο χρήστης δίνει την ηλικία του σε έτη ( έστω ακέραιος)
 *  και το πρόγραμμα επιστρέφει την ηλικία του σε ημέρες. όπου
 *  θεωρούμε ότι 1 έτος = 365 ημέρες. Για παράδειγμα, αν δοθεί
 *  ηλικία 28 ετών, το αποτέλεσμα θα είναι 10220 ημέρες
 */
public class YearsToDaysApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int inputAgeInYears = 0;
        int ageInDays = 0;

        System.out.println("Παρακαλώ εισάγετε την ηικία σας");
        inputAgeInYears = scanner.nextInt();
        ageInDays = inputAgeInYears * DAYS_IN_YEAR;

        System.out.printf("Ηλικία σε έτη : %d, Ηλικία σε ημέρες: %d", inputAgeInYears, ageInDays);



    }
}
