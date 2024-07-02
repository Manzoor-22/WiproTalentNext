package Java_Fundamentals.Array;
public class Checkall1And4 {
    // Given an array of type int, print true if every element is 1 or 4. 
    
    // only14([1, 4, 1, 4]) → true
    // only14([1, 4, 2, 4]) → false
    // only14([1, 1]) → true
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4};

        System.out.println(only14(arr));
    }

    public static boolean only14(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 1 && arr[i] != 4)
                return false;
        }
        return true;
    }
}
