package Java_Fundamentals.Array;

/* Write a program to initialize an integer array with values and check if a given number is present in the array or not.
If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.
Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3. */

public class CheckIfNumberPresent {
    public static void main(String[] args) {
        int array[] = {1,4,6,2,6,-3,5,7,8,12,16};

        check(90, array);
        check(-3, array);
    }

    public static void check(int val, int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}
