import java.util.*;
class Main
{
  public static int power(int b,int e)
  {
    int r=1,s;
    while(e>0)
    {
      r=r*b;
      e=e-1;
    }
    return r;
  }
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int b=sc.nextInt();
  int e=sc.nextInt();
  int s=power(b,e);
  System.out.print(s);
}
}