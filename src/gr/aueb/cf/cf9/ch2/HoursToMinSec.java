package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Calc Hours ti Minutes and Seconds for a given number of hours.
 */
public class HoursToMinSec {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        final int Hours_To_Seconds = 3600;
        final int Hours_To_Minutes = 60;
        int hours = 0;
        int minutes = 0;
        int secconds = 0;

        System.out.println("Please insert the number of hours");
        hours = scanner.nextInt();
        minutes = hours * Hours_To_Minutes;
        secconds = hours * Hours_To_Seconds;

        System.out.printf("The number of minutes is : " + minutes);
        System.out.printf("%nThe number of seconds is : %,d", secconds);


    }
}
