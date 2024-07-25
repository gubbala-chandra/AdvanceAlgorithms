package org.example.bitwiseOperations;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int num = 9;
        int counter =0;
        while(num > 0) {
            if((num & 1) == 1) {
                counter++;
            }
            num >>= 1;
        }
        System.out.println(counter);
    }
    public static int setBits(int num) {
        int counter =0;
        while(num > 0) {
            if((num & 1) == 1) {
                counter++;
            }
            num >>= 1;
        }
        return counter;
    }

    public static int setBits1(int num) {
        int counter =0;
        while(num > 0) {
           counter++;
           num -= (num & -num);
        }
        return counter;
    }
}
