import java.util.Scanner;

public class transpose {
    public static void main(String[] args){
        
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                matrix[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("\nTranspose of the matrix:");
        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(" "+matrix[j][i]); 
            }
            System.out.print("\n"); 
        }


        
    }
}
