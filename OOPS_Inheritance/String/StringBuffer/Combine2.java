package OOPS_Inheritance.String.StringBuffer;

// Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. 
// Any characters left, will go to the end of the result.
// Example1)
// i/p:Hello,World
// o/p:HWeolrllod

public class Combine2 {
    public static void main(String[] args) {
        String s1 = "135711", s2 = "246810";
        System.out.println(solution(s1, s2));
    }
    public static String solution(String s1, String s2){
        StringBuilder ans = new StringBuilder();

        int i = 0, j = 0;

        while(i < s1.length() && j < s2.length()){
            ans.append(s1.charAt(i));
            ans.append(s2.charAt(j));
            i++;
            j++;
        }

        if(i < s1.length()){
            ans.append(s1.substring(i,s1.length()));
        }

        if(j < s2.length()){
            ans.append(s2.substring(j,s2.length()));
        }

        return ans.toString();
    }
}
