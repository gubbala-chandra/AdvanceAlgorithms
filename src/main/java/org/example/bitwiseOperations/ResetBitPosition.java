package org.example.bitwiseOperations;

public class ResetBitPosition {
    public static void main(String[] args) {
        int num = 84;
        int pos = 5;
        System.out.println(resetBitPosition(num, pos));
    }

    public static int resetBitPosition(int num, int pos) {
        return num & (~(1 << pos-1));
    }
}
