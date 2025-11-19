package gr.aueb.cf.cf9.ch6;

public class ArraySymetric {

    public static void main(String[] args) {

    }

    public static boolean isArraySmetric(int[] arr) {
        boolean isSymetric =  true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                //isSymetric = false;
                //break
                return  false;
            }
        }
        //return isSymetric;
        return true;
    }
}
