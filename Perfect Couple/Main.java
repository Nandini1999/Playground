import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j;
      int a[]=new int[10];
      for(i=0;i<n;i++)
        a[i]=sc.nextInt();
      int v=sc.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          if(a[i]+a[j]==v)
            System.out.print(a[i]+", "+a[j]+"\n");
        }
        
        
      }
      
    }
}