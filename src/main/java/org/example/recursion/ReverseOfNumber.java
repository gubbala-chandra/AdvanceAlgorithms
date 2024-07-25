package org.example.recursion;

public class ReverseOfNumber {
    static int sum = 0;
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverse3(num));  //54321

    }

    private static int reverse2(int n) {
        if(n == 0) {
            return 0;
        }
        sum = sum*10 + n%10;
        reverse2(n/10);
        return sum;
    }

    private static int reverse3(int n) {
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

    private static int reverse(int n, int newNum) {
        if(n == 0) {
            return newNum;
        }
        return reverse(n/10, (newNum *10) + n%10);
    }

    private static int reverse1(int n) {
        int sum = 0;
        while(n>0) {
            int rem = n%10;
            sum= (sum * 10)  + rem;
            n = n/10;
        }
        return sum;
    }
}
