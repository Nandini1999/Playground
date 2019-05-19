import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int r;
    r=n*n;
    return r;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int s=square(n);
      System.out.print(s);
	} 
}