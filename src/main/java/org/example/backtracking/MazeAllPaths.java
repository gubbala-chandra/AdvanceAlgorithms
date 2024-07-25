package org.example.backtracking;

import java.util.Arrays;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        for(boolean[] bool : maze) {
            Arrays.fill(bool, false);
        }
        allPath("", maze, 0, 0);
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
            allPath(path+"R", maze, r+1, c);
        }
        if(c < maze[0].length-1) {
            allPath(path+"D", maze, r, c+1);
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
