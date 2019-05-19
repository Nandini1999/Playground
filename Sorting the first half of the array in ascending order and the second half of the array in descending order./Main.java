import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    int l;
    Scanner sc = new Scanner(System.in);
    int len=sc.nextInt();
    int arr[]=new int[len];
    int i,j,k;
    for(i=0;i<len;i++)
      arr[i]=sc.nextInt();
     int[] arr1 = new int[len/2];
     int[] arr2 = new int[len-len/2];
     for(i=0;i<len/2;i++){
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        for(j=len-1,k=0;j>=len/2 && k<=len-len/2;j--,k++){
            arr2[k] =arr[j];
        }
        Arrays.sort(arr2);
        for(i=0;i<len;i++){
            if(i<len/2){
                arr[i]=arr1[i];
            }
            if(i>=len/2){    
                arr[i]=arr2[(len-i)-1];
            }
        }
        for (int var : arr) {
            System.out.print(var+" ");
        }
  }
}