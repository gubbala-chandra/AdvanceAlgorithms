package org.example.recursion;

public class CountNoOfZeros {

    public static void main(String[] args) {
        int n = 30204;
        int counter = 0;
        System.out.println(countZeros(n,counter));
    }

    private static int countZeros(int n, int counter) {
        if(n == 0) {
            return counter;
        }
        if(n%10 ==0)
            counter++;
        return countZeros(n/10, counter);

    }
}
