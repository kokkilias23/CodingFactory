package gr.aueb.cf.cf9.ch2;


import java.io.PrintStream;

/**
 * δημιουργεί υπερχείλιση (overflow)
 */
public class OverflowApp {

    public static void main(String[] args) {
        long num1 = 10;
        int num2 = 1;
        int result = 0;
        int Num1 = 0;
        int numInt = Integer.MAX_VALUE;
        long num3 = Long.MAX_VALUE;
        result = (int)num1;

        System.out.printf("Το αποτέλεσμα είναι:" + result + "%nkai to type num3 einai " + num3 + "%nkai to max enos integer einai :" + numInt);
    }
}
