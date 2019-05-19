import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int i,j,k=2;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
          if(j==n&&(i%2!=0))
          System.out.print(k++);
          else if(j==1&&i%2==0)
            System.out.print(k++);
          else
          {
            System.out.print(i);
          }
        }
        System.out.print("\n");
      }
	}
}