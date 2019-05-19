import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String[] s=new String[n];
    int i,j;
    String temp;
    for(i=0;i<n;i++)
      s[i]=sc.next();
    for(i=0;i<n;i++){
      for(j=i+1;j<n;j++){
        if(s[j-1].compareTo(s[j])>0){
          temp=s[j-1];
          s[j-1]=s[j];
          s[j]=temp;
        }
      }
    }
    for(i=0;i<=n-1;i++)
      System.out.println(s[i].toLowerCase());
  }
}