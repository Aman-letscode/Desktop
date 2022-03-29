abstract class Shape{
    abstract void RectangleArea(int length,int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(int radius);

}

class Area extends Shape{
    public void RectangleArea(int length,int breadth) {
        System.out.println("Area of Rectangle: "+ length*breadth);
    }
    public void SquareArea(int side) {
        System.out.println("Area of Square: "+ side*side);
    }
    public void CircleArea(int radius) {
        System.out.println("Area of Rectangle: "+ 3.14*radius*radius);
    }
}
public class Ass3_7 {
    public static void main(String[] args) {
        Area A = new Area();
        A.RectangleArea(4, 3);
        A.SquareArea(5);
        A.CircleArea(4);
    }
}
