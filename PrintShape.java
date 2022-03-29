class Shape{
    public void print_sh(){
        System.out.println("This is a Shape");
    }
}
class Rectangle extends Shape{
    public void print_rect(){
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape{
    public void print_circle(){
        System.out.println("This is circular shape");
    }
}
class Square extends Rectangle{
    public void print_square(){
        System.out.println("Square is a rectangle");
    }
}


public class PrintShape {
    public static void main(String[] args){
        Square sq = new Square();
        sq.print_rect();
        sq.print_sh();
    }
}
