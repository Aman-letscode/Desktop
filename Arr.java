public class Arr {
    public static void main(String[] args){
        int[] arr ={3,10,2,3,20,5};
        int n=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==10){
                n=1;
            }
            if(n==1){
                if(arr[i]==20){
                    n=2;
                    System.out.println("The sequence '..10...20..' is there");
                }
            }
        }
        if(n!=2){
            System.out.println("The sequence '..10...20..' is not there");
        }
        
    }
}
