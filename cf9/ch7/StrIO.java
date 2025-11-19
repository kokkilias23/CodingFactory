package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

/**
 * String Input/Output
 */
public class StrIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        String str2 = "";

        System.out.println("Please enter two strings: ");
        str = scanner.next();   //διαβαζει μεχρι να βρει whitespace ( spaces, tab, new line)
        str2 = scanner.nextLine(); //διαβαζει μεχρι να βρει new line

        System.out.println(str2);
        System.out.println(str);

    }
}
