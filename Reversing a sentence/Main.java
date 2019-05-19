import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      
      Scanner sc = new Scanner(System.in);
      String s=sc.nextLine();
      String rev[]=s.split(" ");
      for(int i=rev.length-1;i>=0;i--)
      {
        System.out.print(rev[i]+" ");
      }
    }
}