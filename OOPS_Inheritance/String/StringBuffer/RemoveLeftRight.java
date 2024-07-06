package OOPS_Inheritance.String.StringBuffer;

// Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *
// Example1)
// i/p:ab*cd
// o/p:ad

public class RemoveLeftRight {
    public static void main(String[] args) {
        String s = "b*o";
        System.out.println(solution(s));
    }
    public static String solution(String s){
        int i;
        for(i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*')
                break;
        }
        return s.substring(0, i-1) + s.substring(i+2, s.length());
    }
}
