import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
      {
        for(j=m;j>m-i;j--)
        {
          System.out.print(j);
        }
        for(j=1;j<=m-i;j++)
          System.out.print(n-i+1);
       System.out.println(); 
      }
      
    }
}