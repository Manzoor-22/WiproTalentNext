package Java_Fundamentals.Flow_Control_Statements;
import java.util.Scanner;
/* Write a Java program to find if the given number is palindrome or not
Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome
Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        int temp = number, reverse = 0;

        while(temp != 0){
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
        }

        if(number == reverse){
            System.out.println(number + " is a palindrome!");
        } else {
            System.out.println(number + " is not a palindrome!");
        }
    }
}
