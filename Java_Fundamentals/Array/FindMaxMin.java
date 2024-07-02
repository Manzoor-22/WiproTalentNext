package Java_Fundamentals.Array;

// Write a program to initialize an integer array and find the maximum and minimum value of the array.

public class FindMaxMin {
    public static void main(String[] args) {
        int array[] = {1,4,6,2,6,-3,5,7,8,12,16};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int val : array){
            if(val < min)
                min = val;

            if(val > max)
                max = val;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
