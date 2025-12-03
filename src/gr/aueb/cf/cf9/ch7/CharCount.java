package gr.aueb.cf.cf9.ch7;

public class CharCount {

    public static void main(String[] args) {
        String username = "Lalaki_esy?";
        System.out.println(charCount(username));

        int mpampis = charCount(username) + 18;
        int s = username.indexOf("a");
//        System.out.println("/n");
//        System.out.println(s);
//        System.out.println("/n");
//        System.out.println(mpampis);
//        System.out.println(username.substring(5));
//

        System.out.println("Hello world! \n ".repeat(40));

    }

    public static int charCount(String str) {
        if (str == null) return 0;
        return str.length();
    }
}
