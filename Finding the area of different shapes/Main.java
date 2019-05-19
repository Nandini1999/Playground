import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
        //Try your code here
      int c=sc.nextInt();
      switch(c)
      {
        case 1: int s=sc.nextInt();
          		System.out.print(s*s);
          		break;
        case 2: int l=sc.nextInt();
          		int b=sc.nextInt();
          		System.out.print(l*b);
          		break;
        case 3: int br=sc.nextInt();
          		int h=sc.nextInt();
          		System.out.print((br*h)/2);
          		break;
        case 4: int r=sc.nextInt();
          		System.out.print(3.14*r*r);
          	    break;
          
      }
    }
}