import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc = new Scanner(System.in);
   	int p=sc.nextInt();
    int i,j,k,x=0,r,f=0;
    
      r=Math.abs(p);
    k=r;
    if(p<0)
      f=1;
    
    while(r>0)
    {
      x++;
      r=r/10;
    }
    StringBuilder res=new StringBuilder("");
    if(f==1)
      System.out.print('-');
    while(k>0)
    {
      j=k%10;
      char ch=(char)(j+'0');
      res.append(ch);
      k=k/10;
    }
    System.out.print(res.reverse());
    
  }
}