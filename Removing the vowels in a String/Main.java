import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String sb=sc.nextLine();
    StringBuilder s=new StringBuilder(sb);
    StringBuilder res=new StringBuilder("");
    int l=s.length();
    int i;
    for(i=0;i<l;i++)
    {
      if(!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
         s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||
         s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||
         s.charAt(i)=='U'))
        res.append(s.charAt(i));
        
         
    }
    System.out.print(res);
  }
}