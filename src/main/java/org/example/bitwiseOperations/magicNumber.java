package org.example.bitwiseOperations;

public class magicNumber {
    public static void main(String[] args) {
        int n =6;
        System.out.println(magicNumber(n));

    }

    public static int magicNumber(int n) {
        int base =5;
        int ans =0;
        while(n > 0) {
            int last = n & 1;
            n = n>>1;
            ans+=last*base;
            base=base*5;
        }

        return ans;
    }
}
