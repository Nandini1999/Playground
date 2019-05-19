import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
 	int i;
    String p=sc.nextLine();
    int f[]=new int[10];
    for(i=0;i<10;i++)
      f[i]=0;
    int k=0;
    String[] res=p.split(" ");
    for(i=0;i<res.length;i++)
    {
      if(res[i]!=null){
      for(int j=i+1;j<res.length;j++)
      {
        if(res[i].equals(res[j]))
        	res[j]=null;
      }
      }
    }
    k=0;
    for(i=0;i<res.length;i++)
    {
      if(res[i]!=null)
        System.out.print(res[i]+" ");
    }
    
    
  }
}