import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int l = s.length();
      int i,j,p;
      int a[]=new int[26];
      for(i=0;i<26;i++)
        a[i]=0;
      for(i=0;i<l;i++){
        if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
        p=s.charAt(i)-'a';
        a[p]++;
        }
        else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
        p=s.charAt(i)-'A';
        a[p]++;
        }
      }
      char y;
      for(i=0;i<26;i++){
        if(a[i]==0){
          y=(char)(i+'a');
          System.out.print(y+" ");
        } 
      }
    }
}