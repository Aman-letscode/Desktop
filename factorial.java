public class factorial {

    public static void main(String args[]){
            int i=0,fac = 1,num;              
            num = Integer.parseInt(args[0]);
            for(i=num;i>0;i--){
                fac*=i;
            }
            System.out.print(num+"! = "+ fac);
        }
    
}
