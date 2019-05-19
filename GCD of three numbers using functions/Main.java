import java.util.Scanner;
public class Main{

  public static int gcd(int n1,int n2)
  {
	if(n1==0)
      return n2;
    return gcd(n2%n1,n1);
    
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int gd=gcd(n1,n2);
      int y=gcd(gd,n3);
      System.out.print(y);
	}
}