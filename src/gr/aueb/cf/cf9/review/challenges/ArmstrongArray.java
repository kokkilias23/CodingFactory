package gr.aueb.cf.cf9.review.challenges;

public class ArmstrongArray {

    public static boolean isArmstrong(int n) {
        // Μετατροπή αριθμού σε string για να πάρω τα ψηφία
        String s = String.valueOf(n);

        // Φτιάχνω πίνακα int[] με τα ψηφία
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';   // μετατροπή char → int
        }

        int power = digits.length;
        int sum = 0;

        // Υπολογισμός Armstrong sum με βάση τον πίνακα
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == n;
    }

    public static void main(String[] args) {
        int num = 153;

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}


