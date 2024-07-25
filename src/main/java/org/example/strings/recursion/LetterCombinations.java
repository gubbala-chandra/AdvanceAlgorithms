package org.example.strings.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombinations {
    public static void main(String[] args) {
        LetterCombinations lc = new LetterCombinations();
        System.out.println(lc.letterCombinations("23"));
    }
    public  List<String> letterCombinations(String digits) {
        Map<String, String> map = new HashMap<>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4", "ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        List<String> list = new ArrayList<>();
        dailpad("" ,digits, map, list);
        return list;
    }

    private void dailpad(String p, String up, Map<String, String> map, List<String> list) {
        if(up.isEmpty()) {
           list.add(p);
            return;
        }

        String digit = up.charAt(0)+"";
        for(int i =0; i< map.get(digit).length(); i++) {
            char c = map.get(digit).charAt(i);
            dailpad(p+c, up.substring(1), map, list);
        }

    }
}
