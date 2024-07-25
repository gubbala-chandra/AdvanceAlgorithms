package org.example.recursion;

public class FiboWithRecurssion {
    public static void main(String[] args) {
        System.out.println(fibonaciSeries(7));
    }

    public static int fibonaciSeries(int n) {
        if(n < 2){
            return n;
        }
        return fibonaciSeries(n-1) + fibonaciSeries(n-2);
    }

    public static int fiboFprmula(int n) {
        return (int)(Math.pow(((1 + Math.sqrt(5))/2), n) / Math.sqrt(5));
    }
}
