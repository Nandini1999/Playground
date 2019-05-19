import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int a[]=new int[10];
      int n,i,j,k,temp;
      n=sc.nextInt();
      for(i=0;i<n;i++)
        a[i]=sc.nextInt();
      k=sc.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=0;j<n-i-1;j++){
          if(a[j]<a[j+1]){
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
          }
        }
      }
      System.out.print(a[k-1]);
    }   
}