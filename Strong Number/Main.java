import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int f=1,s=0,i,p,r;
      p=n;
      while(n>0)
      {
        r=n%10;
        f=1;
        for(i=1;i<=r;i++)
          f=f*i;
        s=s+f;
        n=n/10;
        
      }
      if(p==s)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}