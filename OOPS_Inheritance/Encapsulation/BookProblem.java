package OOPS_Inheritance.Encapsulation;



// Create a class Book with the following information.
// Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
// [Assumption: Each book will be written by exactly one Author]
// Parameterized Constructor: To initialize the variables
// Getters and Setters for all the member variables

// In the main method, create a book object and print all details of the book (including the author details)

class Author{
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }
}

class Book{
    private String name;
    private Author author;
    private double price;
    private int quantity;

    Book(String name, Author author, double price, int quantity){
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public Author getAuthor(){
        return author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
}

public class BookProblem {
    public static void main(String args[]){
        Author author = new Author("JK Rowlings", "jkl@a.com", 'M');
        Book obj = new Book("HP", author, 499.99, 10);

        System.out.println("Name = " + obj.getName());
        System.out.println("Author Name = " + obj.getAuthor().getName());
        System.out.println("Author Email = " + obj.getAuthor().getEmail());
        System.out.println("Author Gender = " + obj.getAuthor().getGender());
        System.out.println("Price = " + obj.getPrice());
        System.out.println("Quantity = " + obj.getQuantity());
    }
}
