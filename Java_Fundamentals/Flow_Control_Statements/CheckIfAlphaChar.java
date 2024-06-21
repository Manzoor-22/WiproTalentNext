package Java_Fundamentals.Flow_Control_Statements;

/* Initialize a character variable in a program and 
print 'Alphabhet' if the initialized value is an alphabhet, 
print 'Digit' if the initialized value is a number, and 
print 'Special Character', if the initialized value is anything else.
 */

public class CheckIfAlphaChar {
    public static void main(String[] args) {
        char alpha = ' ';

        if(Character.isLetter(alpha)){
            System.out.println("Alphabet");
        } else if(Character.isDigit(alpha)){
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
