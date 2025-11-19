package gr.aueb.cf.cf9.ch4;

/**
 * Εκτυοωνει 10 οριζοντια αστερακια με for
 */

public class StarHorizontalApp {

    public static void main(String[] args) {

        //HORIZONAL STARS
        //for (int i = 1; i <= 10;i++) {
        //   System.out.println("*");
        //}

        //VERTICAL STARS
        for (int i = 1; i <= 10;i++) {
            for (int j = 1; j <= 10;j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }


    }
}
