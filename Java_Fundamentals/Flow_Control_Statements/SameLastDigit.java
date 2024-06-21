package Java_Fundamentals.Flow_Control_Statements;
import java.util.Scanner;

// B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.lastDigit(7, 17) → truelastDigit(6, 17) → falselastDigit(3, 113) → true

public class SameLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First number: ");
        int first = sc.nextInt();

        System.out.print("Enter Second number: ");
        int second = sc.nextInt();

        if(first % 10 == second % 10){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
                                        
        sc.close();
    }
}
