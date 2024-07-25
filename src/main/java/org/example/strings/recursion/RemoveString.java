package org.example.strings.recursion;

public class RemoveString {
    public static void main(String[] args) {
        String str = "abcdappledef";
        System.out.println(removeString(str, "apple",""));
    }

    private static String removeString(String str, String rem, String ans) {
        if(str.isEmpty())
            return ans;
        if(str.startsWith(rem)) {
            str=str.replace(rem, "");
        }
        ans+=str.charAt(0);
        return removeString(str.substring(1), rem, ans);
    }
}
