package Java_Fundamentals.Array;
public class evenOdd {
    // Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

    // evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
    // evenOdd([3, 3, 2]) → [2, 3, 3]
    // evenOdd([2, 2, 2]) → [2, 2, 2]
    public static void main(String[] args) {
        int arr[] = {2, 2, 2};
        arr = check(arr);
        for(int k : arr){
            System.out.print(k + " ");
        }
    }

    public static int[] check(int[] arr){
        int evenCount = 0, oddCount = 0;

        for(int k : arr){
            if(k % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if(evenCount == 0  || oddCount == 0){
            return arr;
        }

        int[] oddArr = new int[oddCount];
        int[] evenArr = new int[evenCount];

        for(int i = 0, k = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                oddArr[k] = arr[i];
                k++;
            }
        }
        for(int i = 0, k = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenArr[k] = arr[i];
                k++;
            }
        }

        System.arraycopy(evenArr, 0, arr, 0, evenCount);

        for(int i = evenCount, k = 0; i < arr.length; i++,k++){
            arr[i] = oddArr[k];
        }

        return arr;
    }
}
