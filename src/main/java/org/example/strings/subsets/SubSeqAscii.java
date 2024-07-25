package org.example.strings.subsets;

import java.util.ArrayList;
import java.util.List;

public class SubSeqAscii {
    public static void main(String[] args) {
        //subSeq("", "abc");
        System.out.println(subSeq1("", "abc"));
    }

    private static void subSeq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));
        subSeq(p+(ch+0), up.substring(1));
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
        list.addAll(subSeq1(p+(ch+0), up.substring(1)));
        return list;

    }

    private static List<String> subSeq2(String p, String up) {
        if(up.isEmpty()) {
            List<String> list = new ArrayList<>();
            if(!p.isEmpty())
                list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        List<String> first = subSeq2(p+ch, up.substring(1));
        List<String> second = subSeq2(p, up.substring(1));
        List<String> third = subSeq2(p+(ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;

    }
}
