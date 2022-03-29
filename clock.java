import java.util.Scanner;

public class clock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time in seconds:");
        int sec = sc.nextInt();
        int hour = sec/3600;
        sec%=3600;
        int min = sec/60;
        sec%=60;
        System.out.println("Here is the time (Hours:Minutes:Seconds) : "+hour+":"+min+":"+sec);
        
    }
}
