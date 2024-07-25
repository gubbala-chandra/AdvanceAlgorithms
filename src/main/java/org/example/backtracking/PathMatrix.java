package org.example.backtracking;

import java.util.Arrays;

public class PathMatrix {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        int[][] pathMatrix = new int[3][3];
        path("", maze, 0,0, pathMatrix, 1);
    }

    private static void path(String p, boolean[][] maze, int r, int c, int[][] pathMatrix, int step) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            pathMatrix[r][c] = step;
            for(int[] arr : pathMatrix)
                System.out.println(Arrays.toString(arr));
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[r][c])
            return;
        maze[r][c] = true;
        pathMatrix[r][c] = step;
        if(r < maze.length-1) {
            path(p+'D', maze, r+1, c , pathMatrix, step+1);
        }
        if(c < maze[0].length-1) {
            path(p+'R', maze, r, c+1 , pathMatrix, step+1);
        }
        if(r > 0) {
            path(p+'U', maze, r-1, c , pathMatrix, step+1);
        }
        if(c > 0) {
            path(p+'L', maze, r, c-1 , pathMatrix, step+1);
        }
        maze[r][c] = false;
        pathMatrix[r][c] = 0;
    }

    private static void allPath(String path, boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(path);
            return;
        }
        if(maze[r][c]) {
            return;
        }
        maze[r][c] = true;
        if(r < maze.length-1) {
            allPath(path+"D", maze, r+1, c);
        }
        if(c < maze[0].length-1) {
            allPath(path+"R", maze, r, c+1);
        }
        if(r > 0) {
            allPath(path+"U", maze, r-1, c);
        }
        if(c > 0) {
            allPath(path+"L", maze, r, c-1);
        }
        // this is the line where function will be over, so before the function gets removed, also renove the changes that are made by
        // the function.
        maze[r][c] = false;

    }
}
