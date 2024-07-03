package Java_Fundamentals.Array;

public class Fibonacci{
    public static void main(String args[]){
        int k = 5;

        int[] fib = new int[k+1]; 
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i <= k; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        System.out.println(fib[k-1]);
    }
}