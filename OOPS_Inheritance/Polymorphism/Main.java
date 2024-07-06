package OOPS_Inheritance.Polymorphism;

// Create  a base class Fruit with name ,taste and size as its attributes. 
// Create a method called eat() which describes the name of the fruit and its taste. 
// Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.

public class Main {
    public static void main(String args[]){
        Fruit fr = new Fruit("Fruit", "Avg", 50);
        Apple ap = new Apple("Apple", "Good", 10);
        Orange or = new Orange("Orange", "Tangy", 15);

        fr.eat();
        System.out.println("\nApple");
        ap.eat();
        System.out.println("\nOrange");
        or.eat();
    }
}

class Fruit{
    protected String name;
    protected String taste;
    protected int size;

    Fruit(String name, String taste, int size){
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat(){
        System.out.println("Name = " + name + " Taste = " + taste);
    }
}

class Apple extends Fruit{
    Apple(String name, String taste, int size){
        super(name, taste, size);
    }
    @Override
    public void eat(){
        System.out.println("Name = " + name);
        System.out.println("Taste = " + taste);
        System.err.println("Size = " + size);
    }
}

class Orange extends Fruit{
    Orange(String name, String taste, int size){
        super(name, taste, size);
    }
    @Override
    public void eat(){
        System.out.println("Name = " + name);
        System.out.println("Taste = " + taste);
        System.err.println("Size = " + size);
    }
}
