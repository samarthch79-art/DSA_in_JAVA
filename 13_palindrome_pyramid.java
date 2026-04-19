// printing a palindrome pyramid


class Main{
    public static void main(String []args){
        for(int i=1;i<10;i++){
            int n=i;
            int m=2;
            for(int j=1;j<10-i;j++){
              System.out.print(' ');
            }
            for(int j=1;j<=i;j++){
                System.out.print(n);
                n--;
            }
            for(int j=1;j<i;j++){
                System.out.print(m);
                m++;
            }
            System.out.println();
        }
    }
}
