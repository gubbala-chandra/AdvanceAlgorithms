package org.example.bitwiseOperations;

public class findPosition {
    public static void main(String[] args) {
        int num = 7;
        int position = 4;
        System.out.println(findPosition(num,position));;
    }

    public static int findPosition(int num, int pos) {
        return num & (1 << (pos-1));
    }
}
