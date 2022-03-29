import java.util.Scanner;

class Sphere{
    
    static int numberOfSphere;
    Sphere(){
        //Static variable
        numberOfSphere++;
    }
    double Area(int rad){
        return 4*3.14*rad*rad;
    }
    double Volume(int rad){
        return 4*3.14*rad*rad*rad/3;
    }
    //Static Method
    static int numberOfSpheres(){
        return numberOfSphere;
    }
}

public class Ass3_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Sphere S1 = new Sphere();
        System.out.println("Number of Sphere:"+S1.numberOfSpheres());
        System.out.print("Enter the radius:");
        int radius1 = inp.nextInt();
        double Area = S1.Area(radius1);
        double Volume = S1.Volume(radius1);
        System.out.println("Area of Sphere:"+Area);
        System.out.println("Volume of Sphere:"+Volume);
        Sphere S2 = new Sphere();
        System.out.println("Number of Sphere:"+S2.numberOfSpheres());
        System.out.print("Enter the radius:");
        radius1 = inp.nextInt();
        Area = S2.Area(radius1);
        Volume = S2.Volume(radius1);
        System.out.println("Area of Sphere:"+Area);
        System.out.println("Volume of Sphere:"+Volume);

    }
}
