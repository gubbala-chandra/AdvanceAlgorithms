package org.example.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class SolveSudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[9];
        for(int i=0; i<9; i++) {
            strs[i] = sc.nextLine();
        }
        int[][] board = new int[9][9];

        int i =0;
        for(String str : strs) {
            int j =0;
            for(char c : str.toCharArray()) {
                board[i][j++] = Integer.valueOf(""+c);
            }
            i++;
        }
        SolveSudoku su = new SolveSudoku();
        if(su.solveSudoku(board)) {
            su.display4(board);
        }

    }

    private void display(int[][] arr) {
        for(int[] rows : arr) {
            for(int c : rows) {
                System.out.print(c+ " ");
            }
            System.out.println();
        }
    }

    private void display1(int[][] arr) {
        for(int[] rows : arr) {
            System.out.println(Arrays.toString(rows));
            System.out.println();
        }
    }

    private void display4(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
                if ((j + 1) % 3 == 0 && j != grid[i].length - 1) {
                    System.out.print("| "); // Add a vertical divider after every 3 numbers, except at the end of a row
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0 && i != grid.length - 1) {
                System.out.println("---------------------"); // Add a horizontal divider after every 3 rows, except at the bottom of the grid
            }
        }
    }
    private void display3(int[][] arr) {
        for(int i =0; i<3; i++) {
            for(int j =i*3; j< 3*(i+1); j++) {
                for(int k =i*3; k< 3*(i+1); k++) {
                    System.out.print(arr[j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public boolean solveSudoku(int[][] board) {
        int n = board.length;
        int r = -1;
        int c = -1;

        boolean emptyLeft = true;
        for(int i=0; i< n; i++) {
            for(int j=0; j< n; j++) {
                if(board[i][j] == 0) {
                    r = i;
                    c =j;
                    emptyLeft = false;
                    break;
                }
            }
            //if you found some empty element in row break;
            if(!emptyLeft) {
                break;
            }
        }

        if(emptyLeft)
            return true;
        // sudoko is solved

        // backtrack
        for(int num=1; num<=9; num++) {
            if(isSafe(board, r, c, num)) {
                board[r][c] = num;
                if(solveSudoku(board)) {
                    //found answer
                    return true;
                } else {
                    // backtrack
                    board[r][c] = 0;
                }
            }
        }
        return false;
    }
    private boolean isSafe(int[][] board, int row, int col, int num) {
        //check the row
        for(int i=0; i< board.length; i++) {
            // check if the number is the row
            if(board[i][col] == num) {
                return false;
            }
        }
        // check column for the given row
        for(int i=0; i< board.length; i++) {
            // check if the number is the row
            if(board[row][i] == num) {
                return false;
            }
        }

        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;
        for(int i= rowStart; i< rowStart+sqrt; i++) {
            for(int j = colStart; j < colStart+sqrt; j++) {
                if(board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
