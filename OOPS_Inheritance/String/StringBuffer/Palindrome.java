package OOPS_Inheritance.String.StringBuffer;

public class Palindrome {
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("Mada");
        str.append("M");
        int i = 0, j = str.length()-1;

        while(i != j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not a palindrome!");
                return;
            }
            i++;
            j--;
        }

        System.out.println("Palindrome");
    }
}
