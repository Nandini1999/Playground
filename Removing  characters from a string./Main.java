import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String p = sc.nextLine();
    String q = sc.nextLine();
    StringBuilder s = new StringBuilder(p);
    StringBuilder r = new StringBuilder(q);
    int i,j;
	for(i=0;i<r.length();i++)
    {
      for(j=0;j<s.length();j++)
      {
        if(r.charAt(i)==s.charAt(j))
          s.setCharAt(j,'$');
      }
    }
    for(i=0;i<s.length();i++)
    {
      if(s.charAt(i)!='$')
       System.out.print(s.charAt(i));
    }
    

  }
}