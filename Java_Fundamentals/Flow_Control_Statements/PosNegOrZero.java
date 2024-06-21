package Java_Fundamentals.Flow_Control_Statements;

import java.util.Scanner;

// A) Write a program to check if a given integer number is Positive, Negative, or Zero.

public class PosNegOrZero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Positive!");
        } else if(num < 0){
            System.out.println("Negative!");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }
}
