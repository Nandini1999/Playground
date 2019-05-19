import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int l = s.length();
      int i,j,p;
      int a[]=new int[26];
      int f[]=new int[26];
      for(i=0;i<26;i++){
        a[i]=0;
      	f[i]=0;
    }
      for(i=0;i<l;i++){
        if(s.charAt(i)>='a'&&s.charAt(i)<='z')
        {
          p=s.charAt(i)-'a';
          a[p]++;
        }
        else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
        {
          p=s.charAt(i)-'A';
          a[p]++;
        }
      }
      String u;
      u=s.toLowerCase();
      
      for(i=0;i<u.length();i++)
      {
        int d = u.charAt(i)-'a';
        int y=a[d];
        if(f[d]==0){
        System.out.print(u.charAt(i));
        System.out.print(y+" ");
        f[d]++;
        }
      }
    }
}