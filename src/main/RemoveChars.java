package main;

public class RemoveChars {

    public static String remove(String str) {

        String removedFirst = new StringBuilder(str).deleteCharAt(0).toString();
        String removedLast = new StringBuilder(removedFirst).deleteCharAt(removedFirst.length() - 1).toString();

        return removedLast;
    }

    //other option
    public static String remove2(String str) {
        return str.substring(1, str.length() - 1);
    }
}
