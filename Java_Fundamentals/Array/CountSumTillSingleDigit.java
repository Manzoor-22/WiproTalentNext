package Java_Fundamentals.Array;
public class CountSumTillSingleDigit {
    public static void main(String[] args) {
        int temp = 123456, digitSum = 0;

        while(!checkSingleDigit(temp)){
            digitSum = sol(temp);
            temp = digitSum;
        }

        System.out.println(digitSum);
    }

    public static boolean checkSingleDigit(int num){
        return num / 10 == 0;
    }

    public static int sol(int temp){
        int digitSum = 0;
        while(temp != 0){
            int digit = temp % 10;
            digitSum += digit;
            temp /= 10;
        }
        return digitSum;
    }
}
