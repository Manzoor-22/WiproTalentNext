package OOPS_Inheritance.String.StringBuffer;

// Write a java program that accepts a string and returns a new string without the first and last character of the input string.
// Example1)
// i/p:Suman
// o/p:uma

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        String st = "Manzoor";
        System.out.println(solution(st));
    }
    public static String solution(String st){
        return st.substring(1, st.length()-1);
    }
}
