package org.example.strings.subsets;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(permutation3("",str));
    }

    private static void permutation(String s, String str) {
        if(str.isEmpty()) {
            System.out.println(s);
            return;
        }
        for(int i=0; i< str.length(); i++) {
            char c = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            permutation(s+c, left+right);
        }

    }

    private static List<String> permutation3(String s, String str) {
        List<String> list = new ArrayList<>();
        if(str.isEmpty()) {
            list.add(s);
            return list;
        }

        for(int i=0; i< str.length(); i++) {
            char c = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            list.addAll(permutation3(s+c, left+right));
        }
        return list;
    }

    private static void permutation2(String s, String str) {
        if(str.isEmpty()) {
            System.out.println(s);
            return;
        }
        char c = str.charAt(0);
        for(int i=0; i<= s.length(); i++) {
            String left = s.substring(0,i);
            String right = s.substring(i);
            permutation2(left+c+right, str.substring(1));
        }

    }

    private static void permutation(String str) {
        for(int i =0; i< str.length(); i++) {
            for(int j =1; j<str.length(); j++) {
                char c = str.charAt(i);
                char d = str.charAt(j);

            }
        }
    }
}
