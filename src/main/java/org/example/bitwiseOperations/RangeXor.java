package org.example.bitwiseOperations;

public class RangeXor {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println(xor(a,b));
        System.out.println(rangeXor(a));
        System.out.println(rangeXor(b));
        System.out.println(rangeXor(b) ^ rangeXor(a-1));
    }

    public static int xor(int a, int b) {
        int ans = a;
        for(int i = a+1; i<=b; i++) {
            ans^=i;
        }
        return ans;
    }

    public static int rangeXor(int a) {
        int val1 = 0;
        switch (a%4) {
            case 0: val1=a; break;
            case 1: val1=1; break;
            case 2: val1=a+1; break;
            default: val1=0;
        }
        return val1;
    }
}
