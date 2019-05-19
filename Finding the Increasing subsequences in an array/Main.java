import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    int i,j,n;
    n=sc.nextInt();
    int a[]=new int[10];
    for(i=0;i<n;i++)
      a[i]=sc.nextInt();
    
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
        if(a[j]>a[i])
          System.out.println(a[i]+","+a[j]); 
      }
    }
  }
}