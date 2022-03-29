package useful;
import java.lang.*;
public class Useme{
    public double area(String shape, int length,int breadth) {
        if(shape == "Square"){
            return length*length;
        }
        else if(shape == "Rectangle"){
            return length*breadth;
        }
        else if(shape == "Circle"){
            return 3.14*length*length;
        }
        else if(shape == "Triangle"){
            return length*breadth/2;
        }
        else{
            System.out.println("Shape not listed in the function!!!");
            return 0;
        }
    }
    public float percentage(int marks_obt, int total_marks) {
        return marks_obt*100/total_marks;
    }
}