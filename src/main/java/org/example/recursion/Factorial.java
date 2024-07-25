package org.example.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sum(5));
    }

    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + factorial(n-1);
    }
}
