public class Sorting {
    public static void main(String[] args) {
        // Write a program to initialize an array and print them in a sorted order.
        int[] array = {1,4,6,7,2,0,8};
        for(int K : array){
            System.out.print(K + " ");
        }
        System.out.println();
        for(int i=0; i < array.length; i++){
            for(int j=i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }
            }
        }
        for(int K : array){
            System.out.print(K + " ");
        }
    }      
}
