package Java_Fundamentals.Array;
public class SucceedingOrder {
    /*  Write a program to print the sum of the elements of an array following the given below condition.
        If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
        Eg1) Array Elements - 10,3,6,1,2,7,9
        O/P: 22   
        [i.e 10+3+9]
        Eg2) Array Elements - 7,1,2,3,6
        O/P:19
        Eg3) Array Elements - 1,6,4,7,9
        O/P:10*/
    public static void main(String args[]){
        int arr[] = {1,6,4,7,9};

        int i = 0, j = arr.length-1, sum = 0;

        while(i != j){
            if(arr[i] != 6)
                i++;
            if(arr[j] != 7)
                j--;

            if(arr[i] == 6 && arr[j] == 7)
                break;
        }

        if(i == j){
            for(int element : arr){
                sum += element;
            }
        } else{
            for(int a = 0; a < i; a++){
                sum += arr[a];
            }
            for(int a = j+1; a < arr.length; a++){
                sum += arr[a];
            }
        }

        System.out.println(sum);
    }
}
