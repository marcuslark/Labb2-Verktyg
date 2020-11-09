package se.iths;

public class TextProcessor {

    public static String reverse(String a) {
        StringBuilder sb = new StringBuilder(a);
        return sb.reverse().toString();
    }

    public static String lowerCase(String a) {
        return a.toLowerCase();
    }

    public static String upperCase(String a) {
        return a.toUpperCase();
    }
}
