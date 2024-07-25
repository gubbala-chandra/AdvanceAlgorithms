package org.example.bitwiseOperations;

public class SumOfNthRowOfPascalTriangle {
    public static void main(String[] args) {
        int pos = 5;
        System.out.println(sumOfNthRow(pos));
    }

    public static int sumOfNthRow(int pos) {
        return 1 << (pos -1);
    }
}
