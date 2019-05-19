import java.util.Scanner;
public class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[11];
    int b[]=new int[10];
    int c[]=new int[10];
    
    int i,j,k;
    for(i=1;i<=n;i++)
      a[i]=sc.nextInt();
    int r=sc.nextInt();
    j=0;
    k=0;
    for(i=1;i<=n;i++)
    {
      if(i%2==0)
        b[j++]=a[i];
      else
        c[k++]=a[i];
    }
    int d[]=new int[10];
    int e[]=new int[10];
    int u=0,v=0;
   for(i=j-1;i>=r;i--)
      d[u++]=b[i];
    for(i=0;i<r;i++)
      d[u++]=b[i];
     
   for(i=k-r;i<k;i++)
   e[v++]=c[i];
   for(i=0;i<k-r;i++)
   e[v++]=c[i];
   
     for(i=0;i<k;i++)
     {
         if(i<k)
        System.out.print(e[i]+" "); 
        if(i<j)
        System.out.print(d[i]+" ");
        
     }
     
  
}
}