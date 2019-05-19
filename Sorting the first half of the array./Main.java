import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int a[]=new int[n+1];
    int i,j;
    for(i=0;i<n;i++)
      a[i]=sc.nextInt();
    int b[]=new int[n/2];
    for(i=0;i<n/2;i++)
      b[i]=0;
    j=0;
    for(i=0;i<n/2;i++)
      b[j++]=a[i];
    
    Arrays.sort(b);
    for(i=0;i<n/2;i++)
      System.out.print(b[i]+" ");
    for(i=n/2;i<n;i++)
        System.out.print(a[i]+" ");
        
      
  }
}