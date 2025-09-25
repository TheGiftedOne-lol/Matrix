import java.util.Arrays;
import java.util.Scanner;
public class lol{
    static Scanner sc=new Scanner(System.in);
    static int p;
    public static void main(String[]args){
        System.out.print("Enter the rows of the matrix:");
        int rows=sc.nextInt();
        System.out.print("Enter the column of the the matrix:");
        int col=sc.nextInt();
        int[][]array=new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
        System.out.print("Enter the values:");
        array[i][j]=sc.nextInt();
    }
        }


        System.out.println("What do you want to do with the matrix?");
        System.out.println("1.Print it (ENTER 1)");
        System.out.println("2.Add (ENTER 2)");
        System.out.println("3.Subtract (ENTER 3)");
        System.out.println("4.Multiply (ENTER 4)");
        System.out.println("5.Transpose (ENTER 5)");
        System.out.println("6.Power (ENTER 6)");
        int c=sc.nextInt();
        switch(c){
            case 1->{
                for(int i=0;i<rows;i++){
                    for(int j=0;j<col;j++){
                        System.out.print(array[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            case 2-> {
                System.out.print("Enter the rows of the other matrix that you want to add:");
                int r = sc.nextInt();
                System.out.print("Enter the column of the other matrix that you want to add:");
                int co = sc.nextInt();
                int[][] a = new int[r][co];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print("Enter the values:");
                        a[i][j] = sc.nextInt();
                    }
                }
                int[][]result=add(array,a);
                print(result);
            }
            case 3-> {
                System.out.print("Enter the rows of the other matrix that you want to subtract:");
                int r = sc.nextInt();
                System.out.print("Enter the column of the other matrix that you want to subtract:");
                int co = sc.nextInt();
                int[][] a = new int[r][co];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print("Enter the values:");
                        a[i][j] = sc.nextInt();
                    }
                }
               int[][]result=sub(array,a);
                print(result);
            }

            case 4->{
                System.out.print("Enter the rows of the other matrix that you want to multiply:");
                int r = sc.nextInt();
                System.out.print("Enter the column of the other matrix that you want to multiply:");
                int co = sc.nextInt();
                int[][] a = new int[r][co];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print("Enter the values:");
                        a[i][j] = sc.nextInt();
                    }
                }
                int[][]result=multiply(array,a);
                print(result);
            }

            case 5->{
                int[][]result =transpose(array);
                print(result);
            }
            case 6->{
                System.out.print("Enter the power:");
                p=sc.nextInt();
                int[][]result=power(array);
                print(result);
            }

            default->System.out.print("WRONG CHOICE");
        }
}
static int[][] add(int [][] a,int[][] n){
int rows=a.length;
int cols=n.length;
int [][]sum=new int[rows][cols];
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=a[i][j]+n[i][j];
            }
        }
return sum;
}
static void print(int [][] m){
        for( int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }}
    public static int[][] sub(int [][] a,int[][] n){
        int rows=a.length;
        int cols=n.length;
        int [][]sub=new int[rows][cols];
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sub[i][j]=a[i][j]-n[i][j];
            }
        }
        return sub;
    }
   public static int [][]multiply(int [][]a,int[][]n){
       int rows=a.length;
       int cols=n.length;
       int [][]multiply=new int[rows][cols];
       for(int i =0;i<rows;i++){
           for(int j=0;j<n[0].length;j++) {
               for(int k=0;k<cols;k++)
               {
               multiply[i][j]+=(a[i][k]*n[k][j]);
           }}
           }
       return multiply;
   }
   public static int [][]transpose(int [][]a){
        int rows=a.length;
        int cols=a.length;
        int [][] transpose=new int [rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i]=a[i][j];
            }
        }
        return transpose;
   }
   public static int[][]power(int [][]a){
        int row=a.length;
        int[][] pow=new int[row][row];
        pow=a;
        for(int i=0;i<p-1;i++){
            pow=multiply(a,pow);
        }
        return pow;
   }
}