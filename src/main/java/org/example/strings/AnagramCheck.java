package org.example.strings;

public class AnagramCheck {

    // Function to check if two strings are anagrams using character count
    public static boolean areAnagrams(String str1, String str2) {
        // Base case: If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Array to count occurrences of each character
        int[] charCounts = new int[26]; // Assuming the strings contain only lowercase alphabetic characters

        // Increment count for characters in str1
        for (int i = 0; i < str1.length(); i++) {
            charCounts[str1.charAt(i) - 'a']++;
        }

        // Decrement count for characters in str2
        for (int i = 0; i < str2.length(); i++) {
            if (--charCounts[str2.charAt(i) - 'a'] < 0) {
                return false; // If any count goes negative, str2 has more of that char
            }
        }

        return true; // If counts balance out, they are anagrams
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + areAnagrams(str1, str2));
    }
}
