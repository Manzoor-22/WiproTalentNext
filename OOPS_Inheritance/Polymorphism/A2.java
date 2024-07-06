package OOPS_Inheritance.Polymorphism;

class A1 {
    void m1() {
        System.out.println(“In method m1 of A1”);
    }
}
class A2 extends A1 {
    int m1() {
        return 100;
    }
    public static void main(String[] args) {
        A2 x = new A2();
        x.m1();
    }
}
