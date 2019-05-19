import java.util.*;
class Main
{
public static void main(String args[])
{
//Try out your code here
  String a, b = "";
        Scanner s = new Scanner(System.in);
        
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equals(b))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
}
}
