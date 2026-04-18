//printing a hollow rectangle
import java.util.Scanner;

class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);    
        System.out.print("enter the number of rows: ");
        int n= sc.nextInt();
        System.out.print("enter the number of column: ");
        int m= sc.nextInt();
            
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i==n-1||i==0||j==0||j==m-1){
                        System.out.print('*');
                    }else
                        System.out.print(' ');
                }
                System.out.println();
            }    
    }
}
