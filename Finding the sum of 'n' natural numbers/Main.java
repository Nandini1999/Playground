import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int r = rec(n);
      System.out.print(r);
    }
  public static int rec(int n)
  {
    if(n==0)
      return 0;
    else
      return n+rec(n-1);
  }
}