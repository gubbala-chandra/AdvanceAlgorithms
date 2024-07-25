package org.example.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MazePathWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        for(boolean[] bool : maze){
            Arrays.fill(bool, true);
        }

        maze[1][1] = false;
        System.out.println(pathRet("", maze,0,0));
    }

    private static List<String> pathRet(String p, boolean[][] maze, int r, int c) {
        List<String> list = new ArrayList<>();
        if(r == maze.length-1 && c == maze[0].length-1) {
            list.add(p);
            return list;
        }
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        if(r < maze.length-1) {
            list.addAll(pathRet(p+'D', maze,r+1, c));
        }
        if(c < maze[0].length-1)
            list.addAll(pathRet(p+'R',maze, r, c+1));
        return list;
    }
}
