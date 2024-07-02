package Java_Fundamentals.Array;
public class Remove10 {
    /*Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.        
        withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
        withoutTen([10, 2, 10]) → [2, 0, 0]
        withoutTen([1, 99, 10]) → [1, 99, 0] */
    public static void main(String args[]){
        int k = 0;
        int arr[] = {1, 99, 10};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 10){
                arr[k++] = arr[i];
            }
        }

        for(int j = 0; j < k; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
