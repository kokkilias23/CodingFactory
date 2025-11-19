package gr.aueb.cf.cf9.ch7;

/**
 * Αντιγραφη Strings γινεται με
 * αντιγραφη δεικτων γιατι το String
 * ειναι immutable
 */
public class StrCopyAndSubstring {
    public static void main(String[] args) {

        // Coppy
        String s1 = "Coding";
        String s2 = s1;     // Copy

        s2 = "Factory";

        System.out.println(s1);
        System.out.println(s2);

        // Substring
        String s3 = s1.substring(1);    //oding
        String s5 = s1.substring(1,3);           // od
    }

    // Traverse chat-by-char me substring
    public static void traverse(String s) {
        for (int i = 0; i < s.length(); i++) {

        }
    }
}
