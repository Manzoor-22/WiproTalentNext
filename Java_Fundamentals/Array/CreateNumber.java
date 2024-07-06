package Java_Fundamentals.Array;
public class CreateNumber {
    public static void main(String[] args) {
        int input1 = 123, input2 = 582, input3 = 175;
        int digits[], max, i = 0;
        digits = new int[3];
        digits[0] = getMin(input1%10, input2%10, input3%10);
        digits[1] = getMin((input1/10)%10, (input2/10)%10, (input3/10)%10);
        digits[2] = getMin((input1/100)%10, (input2/100)%10, (input3/10)%10);

        max = getMax(getMax(input1%10, input2%10, input3%10),getMax((input1/10)%10, (input2/10)%10, (input3/10)%10),getMax((input1/100)%10, (input2/100)%10, (input3/10)%10));

        System.out.println(max);
        for(int k : digits){
            System.out.print(k + " ");
        }
    }
    public static int getMin(int a, int b, int c){
        if(a < b && a < c)
            return a;
        else if(b < a && b < c)
            return b;
        else 
            return c;
    }
    public static int getMax(int a, int b, int c){
        if(a > b && a > c)
            return a;
        else if(b > a && b > c)
            return b;
        else 
            return c;
    }
}
