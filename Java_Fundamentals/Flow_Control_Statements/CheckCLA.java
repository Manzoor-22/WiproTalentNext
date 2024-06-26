package Java_Fundamentals.Flow_Control_Statements;
/*
Write a program to check if the program has received command line arguments or not.
If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)Example1) 

java Example                   O/P: No valuesExample2) 
java ExampleMumbai Bangalore   O/P: Mumbai,Bangalore
[Hint: You can use length property of an array to check its length] 
*/
public class CheckCLA {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No values");
        } else {
            for(String val : args){
                System.out.print(val + ", ");
            }
        }
    }
}
