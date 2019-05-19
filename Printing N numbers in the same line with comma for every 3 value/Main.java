import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int i,x=0,y=3;
    for(i=1;i<=a;i++)
    {
      if((i-1)%y==0&&(i-1)>0)
        System.out.print(",");
      
        System.out.print(i);
        
    }
  }
}