// printing a hollow butterfly


class Main{
    public static void main(String []args){
        int n=10;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
