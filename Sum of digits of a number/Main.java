import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s=0,r;
      while(n>0)
      {
        r=n%10;
        s=s+r;
        n=n/10;
      }
      System.out.println(s);
	}
}