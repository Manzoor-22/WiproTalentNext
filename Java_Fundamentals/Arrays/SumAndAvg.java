package Java_Fundamentals.Arrays;

// Write a program to initialize an integer array and print the sum and average of the array.

public class SumAndAvg {
    public static void main(String[] args) {
        int[] array = {1,4,6,2,6,3,5,7,8,12,16};

        System.out.print("Array : ");
        for(int val : array)
            System.out.print(val + " ");
        System.out.println();

        int sum = 0;
        float average;

        for(int val : array){
            sum += val;
        }

        average = sum / array.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
