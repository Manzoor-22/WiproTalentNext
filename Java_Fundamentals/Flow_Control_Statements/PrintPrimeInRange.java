package Java_Fundamentals.Flow_Control_Statements;
/* Write a program to print prime numbers between 10 and 99.
 */

public class PrintPrimeInRange {
    public static boolean checkPrime(int num){
        for(int i = 2; i < num/2; i++){
            if(num % i == 0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        for(int i = 10; i < 100; i++){
            if(!checkPrime(i))
            System.out.print(i + " ");
        }
    }
}
