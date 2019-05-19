import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int i,x=0;
      for(i=1;x<n;i++)
      {
        if(i%2==1)
        {
          x++;
          System.out.println(i);
        }
      }
	}
}