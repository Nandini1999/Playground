import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[m][n];
    int c[][]=new int[m][n];
    int i,j;
    for(i=0;i<m;i++){
      for(j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<m;i++){
      for(j=0;j<n;j++){
        b[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<m;i++){
      for(j=0;j<n;j++){
        c[i][j]=a[i][j]-b[i][j];
      }
    }
    for(i=0;i<m;i++){
      for(j=0;j<n;j++){
        System.out.print(c[i][j]+" ");
      }
      System.out.println();
    }
  }
}