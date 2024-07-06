package OOPS_Inheritance.Inheritance;

// Create a class called Person with a member variable name. Save it in a file called Person.java
// Create a class called Employee that will inherit the Person class.The other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java
// Your class should have the necessary constructors and getter/setter methods.
// Write another class called TestEmployee, containing a main method to fully test your class definition.

public class Employee extends Person {
    private double annual_sal;
    private int year;
    private String national_insurance_number;

    Employee(double annual_sal, int year, String name,String national_insurance_number){
        super(name);
        this.annual_sal = annual_sal;
        this.year = year;
        this.national_insurance_number = national_insurance_number;
    }

    public void setAnnual_Sal(double annual_sal){
        this.annual_sal = annual_sal;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setNationalInsuranceNumber(String national_insurance_number){
        this.national_insurance_number = national_insurance_number;
    }
    public double getAnnual_Sal(){
        return annual_sal;
    }
    public int getYear(){
        return year;
    }
    public String getNationalInsuranceNumber(){
        return national_insurance_number;
    }
}
