package gr.aueb.cf.cf9.ch13;

/**
 *  Utility classes are non-instantiable.
 *  They provide public stati methods only.
 */

public class HelloUtil {

    /**
     *
     *  No instances of this class should be avaliable.
     */
    private HelloUtil() {}

    public static void sayHello() {
        System.out.println("Hello Coding!");
    }
}
