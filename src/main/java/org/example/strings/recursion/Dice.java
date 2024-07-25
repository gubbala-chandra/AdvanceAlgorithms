package org.example.strings.recursion;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        //dice("", 5);
        System.out.println(diceRet("", 6, 4));
    }

    private static void dice(String  p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6 && i <= target; i++) {
            dice(p+i, target-i);
        }
    }

    private static List<String> diceRet(String  p, int target) {
        List<String> list = new ArrayList<>();
        if(target == 0) {
            list.add(p);
            return list;
        }

        for(int i=1; i<=6 && i <= target; i++) {
            list.addAll(diceRet(p+i, target-i));
        }
        return list;
    }

    private static List<String> diceRet(String  p, int target, int face) {
        List<String> list = new ArrayList<>();
        if(target == 0) {
            list.add(p);
            return list;
        }

        for(int i=1; i<=face && i <= target; i++) {
            list.addAll(diceRet(p+i, target-i, face));
        }
        return list;
    }
}
