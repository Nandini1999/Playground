import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      int f=1,i;
      Scanner sc = new Scanner(System.in);
      int b=sc.nextInt();
      int ex=sc.nextInt();
      for(i=1;i<=ex;i++)
        f=f*b;
      System.out.print(f);
    }
}