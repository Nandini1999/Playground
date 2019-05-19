import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int i,j;
    int a[][]=new int[m][n];
    for(i=0;i<m;i++){
      for(j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<m;i++){
      for(j=0;j<n;j++){
       System.out.print(a[j][i]+" ");
      }
      System.out.println();
    }
   
  }
}