package gr.aueb.cf.cf9.ch7;

public class MyExample {

    public static void main(String[] args) {
        int x = calculate();
        System.out.println(x);
    }

    public static int calculate() {
        int a = 5;
        int b = 0;


        return a / b; // crash εδώ
    }
}
