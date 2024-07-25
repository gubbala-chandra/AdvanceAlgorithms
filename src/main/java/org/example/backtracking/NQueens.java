package org.example.backtracking;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queen(board, 0));
    }


    private static int queen(boolean[][] board, int r) {
        if(r == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        // placing the queen and checking for each row and column
        for(int col =0; col < board.length; col++) {
            //place queen if it is safe
            if(isSafe(board, r, col)) {
                board[r][col] = true;
                count += queen(board, r+1);
                board[r][col]= false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for(int i=0; i< row; i++) {
            if(board[i][col])
                return false;
        }

        // check left diagonal
        int maxLeft = Math.min(row, col);
        for(int i =1; i<=maxLeft; i++) {
            if(board[row-i][col-i])
                return false;
        }

        // check right diagonal
        int maxRight = Math.min(row, board.length-col-1);
        for(int i =1; i<=maxRight; i++) {
            if(board[row-i][col+i])
                return false;
        }
        return true;
    }

    private static void display(boolean[][] board) {

        for(boolean[] bool : board) {
            for(boolean element : bool) {
                if(element)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
