package OOPS_Inheritance.String.StringBuffer;

// Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
// Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
// Example1)
// i/p:Sachin,Tendulkar
// o/p:sachin tendulkar
// Example2)
// i/p:Mark,kate
// o/p:markate

public class Concatenation {
    public static void main(String[] args) {
        System.out.println(add("Sachin","Tendulkar"));
        System.out.println(add("Mark","kate"));
    }
    public static String add(String first, String second){
        if(first.charAt(first.length()-1) == second.charAt(0)){
            return first.toLowerCase() + second.toLowerCase().substring(1);
        }
        return first.toLowerCase() + " " + second.toLowerCase();
    }
}
