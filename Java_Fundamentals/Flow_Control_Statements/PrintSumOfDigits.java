package Java_Fundamentals.Flow_Control_Statements;

/* Write a program to print the sum of all the digits of a given number.
Example1) 
I/P:1234
O/P:10 */

public class PrintSumOfDigits {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int sum = 0;

        for(sum = 0; number != 0; number /= 10){
            int lastDigit = number % 10;
            sum += lastDigit;
        }

        System.out.println(sum);
    }
}
