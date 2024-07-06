package OOPS_Inheritance.String.StringBuffer;

// Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
// You may assume that n is between 0 and the length of the string, inclusive. 
// Example1)
// i/p:Wipro,3
// o/p:propropro

public class NthTimesLastN {
    public static void main(String[] args) {
        String s1 = "Wipro";

        System.out.println(solution("Manzoor", 2));
    }
    public static String solution(String s, int n){
        StringBuilder sol = new StringBuilder();
        for(int i =1; i <= n; i++){
            sol.append(s.substring(s.length() - n,s.length()));
        }
        return sol.toString();
    }
}
