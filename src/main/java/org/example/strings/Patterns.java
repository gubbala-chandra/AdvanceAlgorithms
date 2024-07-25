package org.example.strings;

public class Patterns {
    public static void main(String[] args) {
        pattern32(4);
        /*System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);*/
    }

    public static void pattern1(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n ) {
        for(int i=0; i< n;i++) {
            for(int j=0; j< n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n) {
        for(int i=0;i<2*n; i++) {
            if(i< n){
                for(int j=0; j<i; j++) {
                        System.out.print("* ");
                }
            } else if(i> n) {
                for(int j=(2*n-i); j>0; j--) {
                        System.out.print("* ");
                }
            } else {
                for(int j=0; j<n; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                if(j >= n-i-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern7(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                if(i <=j){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern31(int n) {
        n = 2*n;
        for(int row=0; row<=n; row++) {
            for(int col =0; col<=n; col++) {
                int everyIndex = Math.min(Math.min(row,col), Math.min(n-row, n-col));
                System.out.print(everyIndex+ " ");
            }
            System.out.println();
        }
    }

    public static void pattern32(int n) {
        int original = n;
        n = 2*n;
        for(int row=0; row<=n; row++) {
            for(int col =0; col<=n; col++) {
                int everyIndex = original- (Math.min(Math.min(row,col), Math.min(n-row, n-col)));
                System.out.print(everyIndex+ " ");
            }
            System.out.println();
        }
    }
}
