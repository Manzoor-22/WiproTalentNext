package Java_Fundamentals.Flow_Control_Statements;

/*	
 Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *
 */

public class FloydFormat {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);

        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= size; col++){
                if(row >= col){
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
