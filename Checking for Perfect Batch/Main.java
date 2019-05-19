import java.util.Scanner;
class Main
{
  public static int fun(int a[],int n)
  {
    int i,x=0;
    for(i=n;i<n+3;i++)
    {
      x=x+a[i];
    }
    return x;
  }
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int i,p,f=0;
    int a[]=new int[10];
    for(i=0;i<n;i++)
      a[i]=sc.nextInt();
    int s=a[0]+a[1]+a[2];
    for(i=3;i<n;)
    {
      p=fun(a,i);
      if(p==s)
        f=1;
      i=i+3;
    }
    if(f==1)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
}