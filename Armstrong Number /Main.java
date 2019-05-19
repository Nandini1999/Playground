import java.util.*;
import java.io.*;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int r,x=0,s=0,p,q;
      p=a;
      q=a;
      while(p>0)
      {
        x++;
        p=p/10;
      }
      
      while(a>0)
      {
        r=a%10;
        s=s+(r*r*r);
        a=a/10;
      }
   
      if(s==q)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}