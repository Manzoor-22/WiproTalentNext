package OOPS_Inheritance.String.StringBuffer;

// Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
// The strings will not be the same length, but they may be empty (length 0).
// If input is "hi" and "hello", then output will be "hihellohi".

public class Short {
    public static void main(String[] args) {
        String s1 = "hi", s2 = "hello";

        System.out.println(solution(s1, s2));
    }
    public static String solution(String s1, String s2){
        if(s1.length() < s2.length())
            return s1 + s2 + s1;
        return s2 + s1 + s2;
    }
}
