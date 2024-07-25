package org.example.interview;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        PascalTriangle triangle = new PascalTriangle();
        System.out.println(triangle.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows < 1) {
            return result;
        }
        int i =0;
        while(i < numRows) {
            List<Integer> list = new ArrayList<>(i+1);
            List<Integer> prev = result.isEmpty() ? null : result.get(result.size()-1);
            if(prev == null) {
                list.add(1);
            } else {
                list = new ArrayList<>(prev);
                if( i== 1) {
                    list.add(1);
                } else {
                    list.add(i-1, list.get(i-2) + list.get(i-1));
                }
            }

            result.add(list);
            i++;
        }
        return result;
    }
}
