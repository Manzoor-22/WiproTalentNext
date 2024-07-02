package Java_Fundamentals.Array;
public class Middle {
    // Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

    // middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    // middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    // middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
    public static void main(String args[]) {
        int[] a = {7, 7, 7};
        int[] b = {3, 8, 0};
        
        int[] mid = new int[2];

        mid[0] = a[1];
        mid[1] = b[1];

        for(int k : mid){
            System.out.print(k + " ");
        }
    }
}
