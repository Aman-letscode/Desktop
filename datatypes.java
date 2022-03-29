import java.util.Scanner;

public class datatypes {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int a = sc.nextInt();
        System.out.println("Your Age:"+a);
        System.out.print("Enter your Percentage:");
        float c = sc.nextFloat();
        System.out.println("Your Percentage:"+c);
        System.out.print("Enter a Big Decimal:");
        double dob = sc.nextDouble();
        System.out.println("Your Answer:"+dob);
        System.out.print("Enter your Initial:");
        char i = sc.next().charAt(0);
        System.out.println("Your initial:"+i);
        System.out.print("Are U above 18:");
        boolean b = sc.nextBoolean();
        System.out.println("Your Answer:"+b);
        System.out.print("Enter a long number:");
        long l = sc.nextLong();
        System.out.println("Your Answer:"+l);
        System.out.print("Enter a short number:");
        short s = sc.nextShort();
        System.out.println("Your Answer:"+s);
        System.out.print("Enter a byte:");
        byte by = sc.nextByte();
        System.out.println("Your Answer:"+by);
        System.out.print("Tell about yourself:");
        String str = sc.nextLine();
        System.out.println("Your Response:"+str);
        // sc.close();
    }
}
