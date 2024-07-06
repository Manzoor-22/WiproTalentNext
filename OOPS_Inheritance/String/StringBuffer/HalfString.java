package OOPS_Inheritance.String.StringBuffer;

	
// Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.
// Example1)
// i/p:TomCat
// o/p:Tom
// Example2)
// i/p:Apron
// o/p:null

public class HalfString {
    public static void main(String[] args) {
        String st1 = "Wipro";
        String st2 = "Tomcat";

        System.out.println(solution(st1));
        System.out.println(solution(st2));
    }

    public static String solution(String input){
        if(input.length() % 2 != 0){
            return null;
        }
        return input.substring(0, input.length()/2);
    }
}
