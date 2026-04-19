// printing diamond pattern


class Main{
    public static void main(String []args){
        int n=7;
        for(int i=1;i<n;i+=2){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print('*'+" ");
            }
            System.out.println();
        }
         for(int i=n;i>=0;i-=2){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }
}
