package org.example.math;

import java.util.Scanner;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println("Enter precision:");
        int p = sc.nextInt();
        System.out.println(squareRt(num, p));

    }
    // O(log(n))

    private static double squareRt(int num, int p) {
        int start = 0;
        int end = num;
        double root = 0.0;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid*mid > num){
                end = mid-1;
            } else if(mid*mid < num){
                start = mid+1;
            } else{
                return mid;
            }
        }
        double incr = 1.0;
        for(int i=0; i<p; i++){
            while(root * root <=num) {
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }

        return root;
    }
}
