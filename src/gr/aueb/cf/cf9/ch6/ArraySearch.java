package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Αναζητα ενα στοιχειο σε ενα πινακα
 *
 */
public class ArraySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr ={11, 23, 35, 44, 531, 612, 731, 81, 92, 130};
        int value = 0;
        int position =0;

        System.out.println("Please enter a value to search for: ");
        value = scanner.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Value not found.");
        } else {
            System.out.println("Value " + value + " found at position: " + (position + 1));
        }

    }

    /**
     * Επιστρεφει τη θεση του 1ου στοιχειου του πινακα που
     * ισουται με την τιμη αναζητησης {value}. Αν δεν υπαρχει
     * το στοχειο επιστρεφει
     *
     */
    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

    public static int getPosition2(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
