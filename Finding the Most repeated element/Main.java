import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int a[]=new int[10];
    int b[]=new int[10];
    int n=sc.nextInt();
    int i,x=0,max=0;
    for(i=0;i<n;i++)
      a[i]=sc.nextInt();
    for(i=0;i<10;i++)
      b[i]=0;
    for(i=0;i<n;i++)
    {
      b[a[i]]++;
    }
    for(i=0;i<10;i++)
    {
      if(max<b[i])
        max=b[i];
    }
    if(max==1)
      System.out.print(a[0]);
    else
    System.out.print(max);
  }
}