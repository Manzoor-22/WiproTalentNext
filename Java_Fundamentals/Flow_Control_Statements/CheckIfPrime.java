package Java_Fundamentals.Flow_Control_Statements;
import java.util.Scanner;
// Write a program to check if a given number is prime or not.


public class CheckIfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        for(int i = 2; i < number/2; i++){
            if(number % i == 0){
                System.out.println("Not a prime number!");
                return;
            }
        }
        System.out.println("Prime number!");

    }
}
