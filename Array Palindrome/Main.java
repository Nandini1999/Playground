import java.util.*;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int a[] = new int[10];
      int n=sc.nextInt();
      int i,j,x=0;
      for(i=0;i<n;i++)
        a[i]=sc.nextInt();
      int b[]=new int[n];
      j=n-1;
      for(i=0;i<n;i++)
      {
        b[i]=a[j--];

      }
      x=0;
     
    	for(i=0;i<n;i++)
        {
          if(a[i]==b[i])
            x++;
        }
      
      if(x==n)
        System.out.print("Yes");
      else
        System.out.print("No");
      
      
      
    }
}