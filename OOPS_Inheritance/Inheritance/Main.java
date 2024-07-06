package OOPS_Inheritance.Inheritance;
public class Main {
    public static void main(String args[]){
        Employee e = new Employee(45999.99, 2019, "Manzoor", "AB125");

        System.out.println("e.getName() = " + e.getName());
        System.out.println("e.getAnnual_Sal() = " + e.getAnnual_Sal());
    }
}
