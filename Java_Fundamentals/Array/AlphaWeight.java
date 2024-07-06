package Java_Fundamentals.Array;
public class AlphaWeight {
    public static void main(String[] args) {
        String input1 = "Hello World!!!";
        int input2 = 1;

        input1 = input1.toUpperCase();

        System.out.println(input1);
        int ans = 0;

        if(input2 == 1){
            for(int i = 0; i < input1.length(); i++){
                char c = input1.charAt(i);
                if(Character.isAlphabetic(c))
                    ans += (c - 'A' + 1);
            }
        }
        System.out.println(ans);
    }
}
