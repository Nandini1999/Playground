import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    int i,j;
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int l=s.length();
    int h=l/2;
    String res = s.substring(0,h);
    String tot = s.substring(h,l);
    String r = tot+res;
    for(i=0;i<l;i++)
    {
      for(j=i;j<l-1;j++)
        System.out.print(" ");
      for(j=0;j<=i;j++)
        System.out.print(r.charAt(j));
      System.out.println();
    }
    
  }
}