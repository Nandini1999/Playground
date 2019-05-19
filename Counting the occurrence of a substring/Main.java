import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner s = new Scanner(System.in);
       String  a = s.nextLine();
        String b = s.nextLine();
        int n = a.length();
    	int p=b.length();
    int i,j,f=0,x=0;
    for(i=0;i<n; )
    {
       f=0;
      for(j=0;j<p;j++)
      {
        if(a.charAt(i)==b.charAt(j))
           f=1;
      }
           if(f==1)
           x++;
           i=i+p;
    }
    System.out.print(x);
  } 
}