import useful.*;

public class Ass3_8 {
    public static void main(String[] args) {
        Useme me = new Useme();
        double ar = me.area("Circle", 3, 0);
        System.out.println("Area of Circle="+ar);
        me.area("Trapezium",3,4);
        float percent = me.percentage(455, 480);
        System.out.println("Percentage = "+percent);
    }
}
