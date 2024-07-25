package org.example.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 505;
        System.out.println(prod(num));
    }

    private static int sum(int n) {
        if(n == 0) {
            return 0;
        }
        return (n%10) + sum(n/10);
    }

    private static int prod(int n) {
        if(n%10 == n) {
            return n;
        }
        return (n%10) * prod(n/10);
    }
}
