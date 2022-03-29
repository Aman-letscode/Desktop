class Outer{
    static int n;
    int non=0;
    public static class StaticInner{
        static int noOfObject;
        static void increase(){
            n++;
            System.out.println("n = "+n);
            noOfObject++;
            System.out.println("no of Object = "+noOfObject);
        }
    }
    class Inner{
        int noOfObject=0;
        void increase(){
            non++;
            System.out.println("non="+non);
            noOfObject++;
            System.out.println("no. of Object = "+noOfObject);
        }
    }
}
public class Ass3_3{
    public static void main(String[] args){    
        Outer out = new Outer();
        Outer.Inner obj1 = out.new Inner();
        Outer.StaticInner obj2 = new Outer.StaticInner();
        obj2.increase();
        obj1.increase();
        // obj1.increase();
    }
}