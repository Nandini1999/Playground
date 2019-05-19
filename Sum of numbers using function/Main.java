import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int s=0;
    while(n>0)
    {
      s=s+n;
      n=n-1;
    }
    return s;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int s=sum(n);
      System.out.print(s);
	}
}