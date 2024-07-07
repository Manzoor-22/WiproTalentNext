
public class Volume {
    public static void main(String args[]){
        Box obj = new Box(3,4,5);
    }
}

class Box{
    int height;
    int width;
    int depth;
    Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
        print(height, width, depth);
    }
    void print(int h, int w, int d){
        System.out.println(h * w * d);
    }
}

