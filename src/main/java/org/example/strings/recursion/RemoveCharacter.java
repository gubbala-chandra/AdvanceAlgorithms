package org.example.strings.recursion;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "baccad";
        char toBeRemoved = 'a';
        System.out.println(removeCharacter1(str, toBeRemoved));
    }

    private static String removeCharacter(String str, String ans, char x) {
        if(str.length() == 0)
            return ans;
        if(x != str.charAt(0)){
            ans+= str.charAt(0);
        }
        return removeCharacter(str.substring(1, str.length()), ans, x);
    }

    private static String removeCharacter1(String str, char x) {
        String ans = "";
        if(str.length() == 0)
            return ans;
        if(x != str.charAt(0)){
            ans+= str.charAt(0);
        }
        return ans += removeCharacter1(str.substring(1, str.length()), x);
    }
}
