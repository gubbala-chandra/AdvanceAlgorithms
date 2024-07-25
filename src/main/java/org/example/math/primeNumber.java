package org.example.math;

public class primeNumber {
    public static void main(String[] args) {
        int num = 28;
        System.out.println(num +" Is Prime :: "+ isPrime(num));
    }

    public static boolean isPrime(int n) {
        for(int i =2; i*i <= n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
