import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p=rec(n);
    System.out.print(p);
  }
  public static int rec(int n)
  {
    if(n==1)
      return 1;
    else
      return n*rec(n-1);
  }
}