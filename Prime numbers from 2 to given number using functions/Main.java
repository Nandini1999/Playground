import java.util.Scanner;
class Main{
  public static void primen(int n)
  {
    int i,x=0,j;
    for(i=1;i<=n;i++)
    {
      x=0;
      for(j=1;j<=i;j++)
      {
         if(i%j==0)
        x++;
      }
     if(x==2)
      System.out.println(i);
    }
    
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      primen(n);
	}
}