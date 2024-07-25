package org.example.math;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printPrimeNumbers(num);
    }

    private static void printPrimeNumbers(int num) {
        for(int i=2; i<= num; i++) {
            if(checkPrime(i))
                System.out.println(i);

        }
    }

    private static boolean checkPrime(int num) {
        for(int i =2; i*i <= num; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
