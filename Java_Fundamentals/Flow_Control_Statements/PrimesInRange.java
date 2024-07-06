package Java_Fundamentals.Flow_Control_Statements;

public class PrimesInRange {
    public static void main(String args[]){
        int answer = 0;
        int input1 = 2, input2 = 20;
        for(int i = input1; i <= input2; i++){
            if(checkPrime(i)){
                answer++;
            }
        }

        System.out.println(answer);
	}

    public static boolean checkPrime (int num){
        for(int j = 2; j < num; j++){
            if(num % j == 0){
                return false;
            }
        }
        return true;
    }
}
