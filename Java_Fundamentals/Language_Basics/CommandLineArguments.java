package Java_Fundamentals.Language_Basics;


public class CommandLineArguments {
    public static void main(String[] args) {
        if(args[0].equals("Wipro") && args[1].equals("Banglore")){
            System.out.println("Wipro Technologies Bangalore");
        } else if(args[0].equals("ABC") && args[1].equals("Mumbai")){
            System.out.println(args[0] + "Technologies Mumbai");
        }
    }
}
