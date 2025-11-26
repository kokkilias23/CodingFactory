package gr.aueb.cf.cf9.review.challenges;

public class AmstrongInt {

    public static boolean isArmstrong(int n) {
        int temp = n;
        int digitsCount = 0;

        // 1️⃣ Υπολογισμός αριθμού ψηφίων
        while (temp > 0) {
            temp /= 10;
            digitsCount++;
        }

        // 2️⃣ Γέμισμα int[] με τα ψηφία
        int[] digits = new int[digitsCount];
        temp = n;
        for (int i = digitsCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;  // παίρνουμε τελευταίο ψηφίο
            temp /= 10;             // κόβουμε το τελευταίο ψηφίο
        }

        // 3️⃣ Υπολογισμός Armstrong sum
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digitsCount);
        }

        return sum == n;
    }

    public static void main(String[] args) {
        int num = 9474;

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}

