package gr.aueb.cf.cf9.review.challenges;

/**
 * Δοθέντος ενός {@link String} επιστρέφει ένα String
 * που αποτελεί επανάληψη του αρχικού String, n φορές.
 */

public class RepeatedString {
    public static void main(String[] args) {

    }

    public static String repeatString(String str, int n) {
        if (str == null || str.isBlank()) return "";
        return str.repeat(n);
    }
}
