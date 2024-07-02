package Java_Fundamentals.Array;

import java.util.Arrays;

public class RemoveDuplicates2 {
    /*  Write a program to remove the duplicate elements in an array and print the same.
        Example)
        I/P:{12,34,12,45,67,89}
        O/P:{12,34,45,67,89} 
    */
    public static void main(String args[]){
        int arr[] = {12,34,89,12,45,67,89,89};
        for(int K : arr){
            System.out.print(K + " ");
        }
        System.out.println();
        Arrays.sort(arr);

        int k = 1;
        // 12 12 34 45 67 89 89 89
        for(int i =0; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                arr[k] = arr[i+1];
                k++;
            }
        }

        for(int K : arr){
            System.out.print(K + " ");
        }
    }
}
