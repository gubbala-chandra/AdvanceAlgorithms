package org.example.strings;

import java.util.Arrays;
import java.util.Stack;

public class LargestString {
    public static void main(String[] args) {
        LargestString ls = new LargestString();
        System.out.println(ls.lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty() || s.length() <= 1) {
            return s.length();
        }
        char[] chars = s.toCharArray();
        int length = chars.length;
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        StringBuilder subString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (stack.isEmpty()) {
                subString.append(chars[i]);
                stack.push(chars[i]);
            } else if (stack.search(chars[i]) == -1) {
                subString.append(chars[i]);
                stack.push(chars[i]);
            } else {
                if(result.length() < subString.length()) {
                    result = subString;
                }
                    subString = new StringBuilder(subString.toString().substring(subString.indexOf(""+chars[i])+1));
                    subString.append(chars[i]);
                    stack.clear();
                    updateStack(stack, subString.toString().toCharArray());
            }
        }
        return result.length() == 0 ||  result.length() < subString.length()? subString.length() : result.length();
    }

    private void updateStack(Stack<Character> stack, char[] charArray) {
        for(char c : charArray) {
            stack.push(c);
        }
    }
}
