package org.example.strings;

import java.util.Arrays;

public class IterativePermutations {
    public static void main(String[] args) {
        String input = "abc";
        permuteIteratively(input);
    }

    public static void permuteIteratively(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        while (true) {
            System.out.println(new String(chars));

            int i = chars.length - 2;
            while (i >= 0 && chars[i] >= chars[i + 1]) {
                i--;
            }

            if (i < 0) break;

            int j = chars.length - 1;
            while (chars[j] <= chars[i]) {
                j--;
            }

            swap(chars, i, j);
            reverse(chars, i + 1, chars.length - 1);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            swap(chars, start++, end--);
        }
    }
}
