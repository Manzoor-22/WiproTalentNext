package Java_Fundamentals.Array;
public class RemoveDuplicates {
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

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr = removeVal(j, arr);
                }
            }
        }
        for(int K : arr){
            System.out.print(K + " ");
        }
    }
    public static int[] removeVal(int j, int arr[]){
        int[] newarr = new int[arr.length-1];
        for(int i = 0, k = 0; i < newarr.length; i++, k++){
            if(i == j){
                k++;
            }
            newarr[i] = arr[k];
        }

        return newarr;
    }
}
