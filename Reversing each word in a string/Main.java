import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    String q=sc.nextLine();
    StringBuilder s=new StringBuilder(q);
    
    int i;
    
     String[] parts = q.split(" ");
    for(i=0;i<parts.length;i++){
      StringBuilder x=new StringBuilder(parts[i]);
      System.out.print(x.reverse()+" ");
    }
  }
}