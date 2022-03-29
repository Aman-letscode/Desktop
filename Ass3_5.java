abstract class Bank{
    
    abstract void getBalance();
}

class BankA extends Bank{
    int balance = 100;
    public void getBalance(){
        System.out.println("Balance in Bank A: "+balance+"$");
    }
}
class BankB extends Bank{
    int balance = 150;
    public void getBalance(){
        System.out.println("Balance in Bank A: "+balance+"$");
    }
}
class BankC extends Bank{
    int balance = 200;
    public void getBalance(){
        System.out.println("Balance in Bank A: "+balance+"$");
    }
}

public class Ass3_5{
    public static void main(String[] args) {
        BankA A = new BankA();
        A.getBalance();
        BankB B = new BankB();
        B.getBalance();
        BankC C = new BankC();
        C.getBalance();
    }
}