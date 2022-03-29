import java.util.*;
import java.lang.*;

public class Strings{

    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println(str1 + " " + str2);
        //StringBuffer
        StringBuffer str3 = new StringBuffer("Walchand College");
        System.out.println(str3);
        //StringBuilder
        StringBuilder str4 = new StringBuilder();
        str4.append(str3 + " says " + str1 + " " + str2);
        System.out.println(str4);

        //String Constructors
        //1. byte array to string
        byte[] byt = {119,97,108,99,104,97,110,100};
        String byt_str = new String(byt);
        System.out.println(byt_str);
        
        //2. char array to string
        char[] ch = {'W','a','l','c','h','a','n','d'};
        String ch_str = new String(ch);
        System.out.println(ch_str);

        //length
        System.out.println(str4.length());

        //indexOf
        System.out.println(str3.indexOf(ch_str));

        //charAt
        System.out.println(str3.charAt(4));

        //replace
        System.out.println(str3.replace(0, 3, str2));

        //toLowerCase
        System.out.println(str1.toLowerCase());

        //toUpperCase
        System.out.println(str1.toUpperCase());

        //Compare
        System.out.println(str1.compareTo(str2));

        //Concat
        System.out.println(str1.concat(str2));

        //equalto
        System.out.println(str1.equals(str2));

        //substring
        System.out.println(str3.substring(2,4));
    }
}