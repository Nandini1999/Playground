import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,s=0;
      for(i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(i=0;i<n;i++)
      {
        if(s<a[i])
          s=a[i];
      }
      System.out.print(s);
    }
}