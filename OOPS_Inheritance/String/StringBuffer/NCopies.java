package OOPS_Inheritance.String.StringBuffer;

// Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.
// Example1)
// i/p:Wipro
// o/p:WiWiWiWiWi

public class NCopies {
    public static void main(String[] args) {
        String str = "Wipro";

        System.out.println(solution(str));
    }

    public static String solution(String str){
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            sb.append(str.subSequence(0, 2));
            n--;
        }

        return sb.toString();
    }
}
