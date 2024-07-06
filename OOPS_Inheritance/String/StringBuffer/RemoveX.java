package OOPS_Inheritance.String.StringBuffer;

// Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged. 
// If the input is "xHix", then output is "Hi".
// If the input is "America", then the output is "America".

public class RemoveX {
    public static void main(String[] args) {
        String s1 = "xHix", s2 = "Hello";
        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }
    public static String solution(String s){
        if(s.charAt(0) == 'x' && s.charAt(s.length()-1) == 'x')
            return s.substring(1, s.length()-1);
        else
            return s;
    }
}
