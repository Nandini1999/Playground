import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc = new Scanner(System.in);
      int a[]=new int[10];
      int n = sc.nextInt();
      int x=1,i;
      for(i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(i=0;i<n;i++)
      {
        if(i==0)
        {
          if(a[i+1]!=0&&a[i]==1)
            x++;
        }
        else if(i==n-1)
        {
          if(a[i-1]!=0&&a[i]==1)
            x++;
        }
        else if(a[i-1]==1&&a[i+1]==1&&a[i]==1)
          x++;
          
      }
      System.out.print(x);
    }
}