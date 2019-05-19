import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int l=in.nextInt();
      if(l%4==0&&l%100==0)
      {
        if(l%400==0)
          System.out.print("Leap year");
        else
          System.out.print("Non Leap year");
      }
    }
}