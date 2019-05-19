import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int a[][]=new int[n][n];
      int i,j,val=1;
      int rmin=0,rmax=n-1,cmin=0,cmax=n-1;
      while(rmin<=rmax&&cmin<=cmax){
        for(i=cmax;i>=cmin;i--){
          a[rmin][i]=val++;
        }
        rmin++;
        for(i=rmin;i<=rmax;i++){
          a[i][cmin]=val++;
        }
        cmin++;
        for(i=cmin;i<=cmax;i++)
          a[rmax][i]=val++;
        rmax--;
        for(i=rmax;i>=rmin;i--)
          a[i][cmax]=val++;
       cmax--;
      }
      for(i=0;i<n;i++){
        for(j=0;j<n;j++)
          System.out.print(a[i][j]+" ");
        System.out.println();
      }
    }
}