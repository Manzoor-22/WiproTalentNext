package Java_Fundamentals.Flow_Control_Statements;

/*
Initialize two character variables in a program and display the characters in alphabetical order.
Example1) if the first character is 's' and second character is 'e' then the output should be  e,s
Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
 */

public class AlphabetOrder {
    public static void main(String[] args) {
        char first = 'a', second = 'c';

        if(first < second){
            System.out.println(first + "," + second);
        } else {
            System.out.println(second + "," + first);
        }
    }
}
