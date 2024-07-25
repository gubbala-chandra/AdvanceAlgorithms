package org.example.math;

public class HCF {
    public static void main(String[] args) {
        /* hcf(a,b) 9 -> 1,3,9
        18 -> 1,2, 3,9 18

         */
        int a = 224;
        int b = 105;
        System.out.println(hcf(a,b));
        System.out.println(lcm(a,b));
    }

    private static int hcf(int a, int b) {
        if( a == 0) {
            return b;
        }
        return hcf(b%a, a);
    }

    private static int lcm(int a, int b) {
        return a * b/hcf(a,b);
    }
}
