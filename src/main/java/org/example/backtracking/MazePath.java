package org.example.backtracking;

import java.util.ArrayList;
import java.util.List;

public class MazePath {
    public static void main(String[] args) {
        System.out.println(pathRetWithDiagonal("", 3,3));
    }

    private static void path(String p, int r, int c) {
        if(r ==1 && c ==1) {
            System.out.println(p);
            return;
        }
        if(r > 1) {
            path(p+'D', r-1, c);
        }
        if(c > 1)
            path(p+'R', r, c-1);
    }

    private static List<String> pathRet(String p, int r, int c) {
        List<String> list = new ArrayList<>();
        if(r ==1 && c ==1) {
            list.add(p);
            return list;
        }
        if(r > 1) {
            list.addAll(pathRet(p+'D', r-1, c));
        }
        if(c > 1)
            list.addAll(pathRet(p+'R', r, c-1));
        return list;
    }

    private static List<String> pathRetWithDiagonal(String p, int r, int c) {
        List<String> list = new ArrayList<>();
        if(r ==1 && c ==1) {
            list.add(p);
            return list;
        }
        if(r > 1 && c > 1)
            list.addAll(pathRetWithDiagonal(p+'D', r-1, c-1));
        if(r > 1) {
            list.addAll(pathRetWithDiagonal(p+'V', r-1, c));
        }
        if(c > 1)
            list.addAll(pathRetWithDiagonal(p+'H', r, c-1));
        return list;
    }

}
