package org.example.math;

import java.util.Scanner;

public class Seive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean[] primes = new boolean[num+1];
        seive(num,primes);
    }

    private static void seive(int num, boolean[] primes) {
        for(int i=2; i*i <= num; i++) {
            if(!primes[i]) {
                for(int j = i*2; j<=num; j=j+i){
                    primes[j] = true;
                }
            }
        }
        for(int i=2; i<=num; i++) {
            if(!primes[i])
                System.out.print(i+" ");
        }
    }
}
