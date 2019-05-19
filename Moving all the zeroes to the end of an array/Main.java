import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,j,x=0;
      for(i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(i=0;i<n;i++)
      {
        if(a[i]==0)
          x++;
      }
      for(i=0;i<n;i++)
      {
        if(a[i]!=0)
          System.out.print(a[i]+" ");
      }
      for(i=0;i<x;i++)
        System.out.print(0+" ");
    }
}