package edu.lab.util;

public final class PalindromeUtil {
    private PalindromeUtil(){}

    public static boolean isPalindrome(String text){
        // TODO: ignore spaces and case, treat null/empty as false except empty string may be true
        if (text == null) return false;
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        if (cleaned.isEmpty()) return true;
        String reversed = new StringBuffer(cleaned).reverse().toString();
        return cleaned.equals(reversed);
        // throw new UnsupportedOperationException("TODO");
    }

    public static String reverse(String text){
        // TODO: use StringBuffer(new String(text)).reverse().toString() style logic
        if (text == null) return null;
        return new StringBuffer(text).reverse().toString();
        // throw new UnsupportedOperationException("TODO");
    }
}
