import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc= new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int a[][]=new int[m][n];
    int i,j,x=0;
    for(i=0;i<m;i++){
      for(j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
    }
   for(j=n-1;j>=0;j--){
     for(i=0;i<m;i++)
     {
       System.out.print(a[i][j]+" ");
     }
      System.out.println();
   }
   
  }
}