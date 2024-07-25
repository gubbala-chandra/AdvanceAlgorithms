package org.example.strings.subsets;

public class StrPermutation {
    public static void main(String[] args) {
        String str = "abc";
        printPermutation("", str);
    }

    private static void printPermutation(String p, String str) {
        if(str.length() == 0 ) {
            System.out.println(p);
            return;
        }

        for(int i=0; i< str.length(); i++) {
            printPermutation(p+str.charAt(i), str.substring(0,i) + str.substring(i+1));
        }
    }
}
