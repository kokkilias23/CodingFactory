package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;

/**
 * Γράψτε μια μέθοδο που δέχεται έναν πίνακα ακεραίων
 * και επιστρέφει τον μεγαλύτερο αριθμό.
 */

public class FindMax {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 4, 12, 7, 84};
        int max = 0;

        max = findMax(arr);
        System.out.println("Max: " + max);

        max = arr[findMaxPosition(arr)];
        System.out.println("Max: " + max);

    }

    public static int findMax(int[] arr) {
        return Arrays.stream(arr).max()
                .orElseThrow(() -> new RuntimeException("Array is null"));
    }

    public static int findMaxPosition(int[] arr) {
        int max;
        int maxPosition;

        if (arr == null || arr.length == 0)
            throw new RuntimeException("Array is null");

        maxPosition = 0;
        max = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                maxPosition = i;
                max = arr[maxPosition];
            }
        }

        return maxPosition;
    }
}
