class Non_Arg{
    Non_Arg(){
        System.out.println("This is a non-argument constructor!!");
    }
}

class Parametrized{
    Parametrized(int num){
        System.out.println("This is a parameterized constructure which took the value: "+num);
    }
}
public class Constructors {
    public static void main(String[] args){
        Non_Arg Arg = new Non_Arg();
        
        Parametrized para = new Parametrized(3);
    }
}
