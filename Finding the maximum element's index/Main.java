import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,j=0,max=0;
    int a[]=new int[10];
    for(i=0;i<n;i++)
      a[i]=sc.nextInt();
    for(i=0;i<n;i++)
    {
      if(max<a[i]){
        max=a[i];
        j=i;
      }
    }
    System.out.print(j);
  }
}