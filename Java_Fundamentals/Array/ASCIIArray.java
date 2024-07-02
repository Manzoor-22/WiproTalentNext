package Java_Fundamentals.Array;

// Initialize an integer array with ascii values and print the corresponding character values in a single row.

public class ASCIIArray {
    public static void main(String[] args) {
        int[] array = {65, 68, 71, 97, 95, 116, 128};

        for(int i = 0; i < array.length; i++){
            System.out.println((char)array[i] + " ");
        }
    }
}
