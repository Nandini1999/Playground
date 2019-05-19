import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      char c = sc.next().charAt(0);
      int key=sc.nextInt();
      int off=c-key;
      if(off<97&&c>'a'&&c<'z')
      {
        int i=97-off-1;
        char cd=(char)(122-i);
        System.out.print(cd);
      }
     
      else
      System.out.print((char)off);
      
    }
}