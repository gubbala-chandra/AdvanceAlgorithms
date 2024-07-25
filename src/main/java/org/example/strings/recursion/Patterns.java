package org.example.strings.recursion;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        pattern2(5);
    }

    private static void pattern1(int i) {
        helper2(i, 0);
    }

    private static void helper(int r, int c) {
        if(r == 0)
            return;
        while(r > c) {
            c++;
            System.out.print("* ");
        }
        System.out.println();
        helper(r-1, 0);
    }

    private static void helper2(int r, int c) {
        if(r == 0)
            return;
        if(r > c) {
            System.out.print("* ");
            helper(r, c+1);
        }else {
            System.out.println();
            helper(r-1, 0);
        }

    }

    private static void pattern2(int i) {
        helper3(i, 0);
    }

    private static void helper3(int r, int c) {
        if(r == 0)
            return;
        if(r > c) {
            helper3(r, c+1);
            System.out.print("* ");
        }else {
            helper3(r-1, 0);
            System.out.println();
        }

    }

}
