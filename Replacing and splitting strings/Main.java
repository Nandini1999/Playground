import java.util.*;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc = new Scanner(System.in);
      int i,j;
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      int n=sc.nextInt();
      s1=s2;
      String[] s=s1.split(" ");
      for(String p:s)
        System.out.print(p+"\n");
      
      
    }
}