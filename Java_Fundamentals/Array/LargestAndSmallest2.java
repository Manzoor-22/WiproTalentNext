package Java_Fundamentals.Array;

//  Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

public class LargestAndSmallest2 {
    public static void main(String[] args) {
        int array[] = {1,14,6,2,6,-3,5,7,8,12,16};

        int largest = Integer.MIN_VALUE, secLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secSmallest = Integer.MIN_VALUE;

        for(int val : array){
            if(val > largest) {
                secLargest = largest;
                largest = val;
            }
            if(val < smallest) {
                secSmallest = smallest;
                smallest = val;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secLargest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secSmallest);
    }
}
