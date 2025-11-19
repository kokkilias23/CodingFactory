package gr.aueb.cf.cf9.ch5;

/**
 * Demo of Floating Point Numbers.
 */

public class FloatingPointApp {

    public static void main(String[] args) {
        System.out.printf("Float , Size: %d, Min %2e, Max %.2e\n", Float.BYTES * 8, Float.MIN_VALUE, Float.MIN_VALUE );
        System.out.printf("Double , Size: %d, Min %2e, Max %.2e\n", Double.BYTES * 8, Double.MIN_VALUE, Double.MIN_VALUE);

        double myDouble = 2.0;


    }
}
