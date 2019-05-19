import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String p = sc.nextLine();
      String r = sc.nextLine();
      int i,j;
      String f = s.replace(p,r);
      System.out.print(f);
    }
}