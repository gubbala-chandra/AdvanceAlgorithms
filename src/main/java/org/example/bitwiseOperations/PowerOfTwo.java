package org.example.bitwiseOperations;

public class PowerOfTwo {
    public static void main(String[] args) {
        int number = 34;
        boolean value = (number & (number-1)) == 0;
        if(number == 0)
            value = false;
        System.out.println("power of 2 ::" + value);
    }
}
