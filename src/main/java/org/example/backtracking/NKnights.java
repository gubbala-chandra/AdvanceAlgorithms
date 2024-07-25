package org.example.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        List<boolean[][]> list = new ArrayList<>();
        knights(board, 0,0, 4, list);
        System.out.println(list.size());

    }

    private static void knights(boolean[][] board, int row, int col, int target,  List<boolean[][]> list) {
        if(target == 0) {
            display(board);
            System.out.println();
            list.add(board);
            return;
        }
        if(row == board.length-1 && col == board.length) {
            return;
        }
        if(col == board.length) {
            knights(board, row+1, 0, target, list);
            return;
        }
        if(isSafe(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col+1, target-1, list);
            board[row][col] = false;
        }
        knights(board, row, col+1, target, list);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row-2, col-1)) {
            if(board[row-2][col-1])
                return false;
        }
        if(isValid(board, row-2, col+1)) {
            if(board[row-2][col+1])
                return false;
        }
        if(isValid(board, row-1, col+2)) {
            if(board[row-1][col+2])
                return false;
        }
        if(isValid(board, row-1, col-2)) {
            if(board[row-1][col-2])
                return false;
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    private static void display(boolean[][] board) {

        for (boolean[] bool : board) {
            for (boolean element : bool) {
                if (element)
                    System.out.print("K ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
