package gr.aueb.cf.cf9.ch7;

public class Peirama {
    public static void main(String[] args) {



        try {
            int a = 10;
            int b = 0;
            int result = a / b; // εδώ θα πετάξει exception
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
}
