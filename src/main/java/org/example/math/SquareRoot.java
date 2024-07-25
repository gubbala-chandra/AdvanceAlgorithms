package org.example.math;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        squareRoot(num);
    }

    private static void squareRoot(int num) {
        for(int i=2; i*i <=num; i++){
            if(i*i == num) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("not a perfect square");
    }


}
