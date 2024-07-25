package org.example.recursion;

public class Palindrome {

    public static void main(String[] args) {
        int num = 1234543210;
        System.out.println(isPalindrome(num));  //54321

    }

    private static int reverse(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }

    private static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    private static boolean isPalindrome2(int n, int s, int e) {
        return n == reverse(n);
    }
}
