import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int m=0;
      if(a>b&&a>c)
        m=a;
      else if(b>a&&b>c)
        m=b;
      else
        m=c;
      System.out.print(m);
      
    }
}