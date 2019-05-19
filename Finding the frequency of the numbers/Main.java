import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      int a[] = new int[10];
      int i,j,n,k;
      n=sc.nextInt();
      k=sc.nextInt();
      int x=0;
      for(i=0;i<n;i++)
        a[i]=sc.nextInt();
      int b[]=new int[10];
      for(i=1;i<=k;i++)
        b[i-1]=0;
      for(i=0;i<n;i++)
      {
        x=a[i];
        b[x-1]++;
      }
      for(i=0;i<k;i++)
        System.out.print(i+1+" "+b[i]+"\n");
    }
}