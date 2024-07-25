package org.example.math;

public class NewtonSqrt {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(sqrt(25));
    }

    public static double sqrt(int n) {
        double x = n;
        double root;
        while(true) {
            root = 0.5 * (x + (n/x));
             if(Math.abs(root - x) < 0.5) {
                 break;
             }
             x = root;
        }
        return root;
    }
}
