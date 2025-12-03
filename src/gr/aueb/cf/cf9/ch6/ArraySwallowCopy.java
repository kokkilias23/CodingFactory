package gr.aueb.cf.cf9.ch6;

/**
 * Οταν κανουμε copy references, τοτε
 * το copy ονομαζεται shallo και εχει
 * side effects..
 */
public class ArraySwallowCopy {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1;   // Swallow copy

        arr2[0] = 1000;
        System.out.println(arr1[0]);
    }
}
