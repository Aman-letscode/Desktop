import java.util.*;

public class Ass3_4 {
    public static void main(String[] args) {
        final int speedlimit = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Speed:");
        int speed = sc.nextInt();
        if(speed>speedlimit){
            System.out.println("Speed Limit is Exceeded!!");
        }
        
    }
}
