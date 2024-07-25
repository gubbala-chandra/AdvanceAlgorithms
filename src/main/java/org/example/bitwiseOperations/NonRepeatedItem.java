package org.example.bitwiseOperations;

public class NonRepeatedItem {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,7,8,7,8,8};
        System.out.println(nonRepeatedNumber(arr));
    }

    public static int nonRepeatedNumber(int[] arr) {
        int sum = 0;
        for(int i: arr) {
            sum ^= i;
        }
        // Find the rightmost set bit in xor
        int rightmostSetBit = sum & -sum;

        // Divide elements into two groups and XOR separately
        int num1 = 0, num2 = 0;
        for (int value : arr) {
            if ((value & rightmostSetBit) != 0) {
                num1 ^= value;
            } else {
                num2 ^= value;
            }
        }

        System.out.println("The two odd occurring numbers are " + num1 + " and " + num2);
        return sum%3;
    }
}
