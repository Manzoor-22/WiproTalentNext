package Java_Fundamentals.Flow_Control_Statements;
import java.util.Scanner;

/* Write a program to reverse a given number and print
Example1)
I/P: 1234
O/P:4321
Example2)
I/P:1004
O/P:4001
*/

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        int reverse = 0;
        int temp = number;

        while(temp != 0){
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
        }
        System.out.println(reverse);
    }
}
