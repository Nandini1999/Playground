import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
        a[i]=sc.nextInt();
      int s=sc.nextInt();
      int p=sc.nextInt();
      int f=0,k=0;
      for(i=0;i<n;i++)
      {
        if(a[i]==s)
        {
          f=i;
          break;
        }
          
      }
      for(i=0;i<n;i++)
      {
        if(a[i]==p)
        {
          k=i;
          break;
        }
    }
      if(f<n&&f!=0)
      System.out.println(f);
      else
        System.out.print("-1");
      if(k<n&&k!=0)
      System.out.println(k);
      else
        System.out.print("-1");
     
}
}