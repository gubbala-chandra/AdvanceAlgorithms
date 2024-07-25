package org.example.strings;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(checkPalidrome(str));
    }
    public static boolean checkPalidrome(String str) {
        if(str == null || str.length() == 1)
            return true;
        str = str.toLowerCase(Locale.ROOT);
        for(int i=0; i< str.length()/2; i++) {
            if(str.indexOf(i) != str.indexOf(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
