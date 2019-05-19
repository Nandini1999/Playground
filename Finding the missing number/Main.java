import java.util.Scanner;
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
      int b[]=new int[n+1];
      for(i=1;i<=n;i++)
        b[i-1]=0;
      for(i=0;i<n;i++)
      {
        x=a[i];
        b[x-1]++;
      }
      for(i=0;i<n;i++)
      {
        if(b[i]==0)
          System.out.print(i+1);
      }
      
      
    }
}