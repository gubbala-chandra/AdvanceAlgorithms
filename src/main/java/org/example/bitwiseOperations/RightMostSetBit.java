package org.example.bitwiseOperations;

public class RightMostSetBit {
    public static void main(String[] args) {
        int num = 182;
        System.out.println(rightMostSetBit(num));
    }

    public static int rightMostSetBit(int num) {
        return num & (-num);

    }
}
