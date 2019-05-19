import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner sc= new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[m][n];
    int i,j,x=0;
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
        if(a[i][j]==b[i][j])
          x++;
      }
    }
    if(x==m+n)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}