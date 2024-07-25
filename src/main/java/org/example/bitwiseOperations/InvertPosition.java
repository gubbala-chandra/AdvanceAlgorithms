package org.example.bitwiseOperations;
/* convert i-th bit in the given number invert it if 0 then make 1

 */
public class InvertPosition {

    public static void main(String[] args) {
        int num = 10;
        int pos = 3;
        System.out.println(invertPosition(num,pos));
    }

    public static int invertPosition(int num, int pos) {
        return num | (1 << pos-1);
    }

}
