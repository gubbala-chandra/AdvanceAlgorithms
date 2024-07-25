package org.example.bitwiseOperations;

public class Power {
    public static void main(String[] args) {
        int n = 3;
        int p = 6;

        int ans = 1;

        while(p > 0) {
            if((p & 1) == 1) {
                ans *= n;
            }
            n*=n;
            p = p >> 1;
        }
        System.out.println(ans);
    }
}
