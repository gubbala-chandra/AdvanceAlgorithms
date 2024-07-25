package org.example.strings.subsets;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        String str = "abc";
        subSeq("", str);
        System.out.println(subSeq1("", str));

    }

    private static void subSeq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));

    }

    private static List<String> subSeq1(String p, String up) {
        List<String> list = new ArrayList<>();
        if(up.isEmpty()) {
            if(!p.isEmpty())
                list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        list.addAll(subSeq1(p+ch, up.substring(1)));
        list.addAll(subSeq1(p, up.substring(1)));
        return list;

    }
}
