class Point{
    private int x;
    private int y;

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

public class Encap {
    public static void main(String args[]){
        Point p = new Point();

        p.setX(10);
        p.setY(15);

        System.out.println("X = " + p.getX());
        System.out.println("Y = " + p.getY());
    }
}
