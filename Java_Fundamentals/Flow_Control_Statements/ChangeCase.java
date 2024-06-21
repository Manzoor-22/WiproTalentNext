package Java_Fundamentals.Flow_Control_Statements;

/* Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a */

public class ChangeCase {
    public static void main(String[] args){
        char alphabet = 'Z';

        if(Character.isLowerCase(alphabet)){
            System.out.println(alphabet + "->" + Character.toUpperCase(alphabet));
        } else{
            System.out.println(alphabet + "->" + Character.toLowerCase(alphabet));
        }
    }   
}
