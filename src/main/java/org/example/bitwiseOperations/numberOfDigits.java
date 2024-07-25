package org.example.bitwiseOperations;

public class numberOfDigits {
    public static void main(String[] args) {
        int n = 345678;
        int b = 10;

        int ans = (int)(Math.log(n) / Math.log(b)) +1;

        System.out.println(ans);

        int a = 12;
        int count = 0;

        // (n & (n-1)) == 0 ==> number is power of 2
        while(a > 0) {
            int last = a & 1;
            a = a >> 1;
            if(last == 1) {
                count++;
            }
        }
        if(count == 1) {
            System.out.println("it is power of 2");
        }
    }
}
