package OOPS_Inheritance.Inheritance;

// Create a class named ‘Animal’ which includes methods like eat() and sleep().
// Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
// Create an instance of Animal class and invoke the eat and sleep methods using this object.
// Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.

class Animal{
    public void eat(){
        System.out.println("Animal -> eat()");
    }
    public void sleep(){
        System.out.println("Animal -> sleep()");
    }
}

class Bird extends Animal{
    @Override
    public void eat(){
        System.out.println("Bird -> eat()");
    }
    @Override
    public void sleep(){
        System.out.println("Bird -> sleep()");
    }
    public void fly(){
        System.out.println("Bird -> fly()");
    }
}

public class AnimalProb {
    public static void main(String args[]){
        Animal a = new Animal();
        a.eat();
        a.sleep();

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
