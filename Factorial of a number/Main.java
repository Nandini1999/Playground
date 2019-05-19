import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int f=1,i;
      for(i=1;i<=a;i++)
      {
        f=f*i;
      }
      System.out.println(f);
	}
}