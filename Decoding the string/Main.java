import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    String q = sc.nextLine();
    StringBuilder s = new StringBuilder(q);
    int key=sc.nextInt();
    int i,j;
    for(i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch>='A' && ch<='Z'){
        ch=(char)(ch-key);
        if(ch<'A')
          ch=(char)(ch+26);
      }
       else if(ch>='a' && ch<='z'){
        ch=(char)(ch-key);
        if(ch<'a')
          ch=(char)(ch+26);
      }
      s.setCharAt(i,ch);
    }
    System.out.print(s);
  }
}