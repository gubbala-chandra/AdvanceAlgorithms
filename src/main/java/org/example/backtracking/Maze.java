package org.example.backtracking;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }

    private static int count(int r, int c) {
        int count = 0;
        if(r == 1 || c == 1) {
            count++;
            return count;
        }
        count+=count(r-1, c);
        count+=count(r, c-1);
        return count;
    }
}
