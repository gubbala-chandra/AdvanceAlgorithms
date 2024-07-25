package org.example.recursion;

public class NtoI {
    public static void main(String[] args) {
        printNumbersInBothOrders(5);
    }

    private static void printNumbersReverseOrder(int n) {
        System.out.print(n + " ");
        if(n == 1) {
            return;
        }
        printNumbersReverseOrder(n-1);
    }

    private static void printNumbers(int n) {
        if(n == 0) {
            return;
        }
        printNumbers(n-1);
        System.out.print(n + " ");
    }

    private static void printNumbersInBothOrders(int n) {
        if(n == 0) {
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        printNumbersInBothOrders(n-1);
        System.out.print(n + " ");
    }
}
