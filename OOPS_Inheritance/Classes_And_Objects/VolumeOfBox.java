package OOPS_Inheritance.Classes_And_Objects;
// Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.

class Box{
    int width;
    int height;
    int depth;

    Box(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    int volume(){
        return width * height * depth;
    }
}

public class VolumeOfBox {
    public static void main(String[] args) {
        Box b = new Box(5, 2, 3);
        System.out.println(b.volume());
    }
}
