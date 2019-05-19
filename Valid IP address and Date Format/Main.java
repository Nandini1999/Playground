import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*; 
class Ip
{
  public boolean disp(String str)
  {
    Pattern ptn = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Matcher mtch = ptn.matcher(str);
        return mtch.find();
  }
  public boolean display(String dt)
  {
    String regex = "^(1[0-2]|0[1-9])/(3[01]"
                       + "|[12][0-9]|0[1-9])/[0-9]{4}$"; 
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher((CharSequence)dt); 
        return matcher.matches(); 
  }
}
public class Main{
	
	public static void main(String[] args){
	    // type your code here
      Scanner sc = new Scanner(System.in);
      String iip=sc.nextLine();
      String dt = sc.nextLine();
      Ip ip = new Ip();
      boolean s=ip.disp(iip);
      boolean p =ip.display(dt);
      if(s==true)
        System.out.println(iip+" is valid? "+s);
      else
        System.out.println(iip+" is valid? "+s);
      if(p==true)
        System.out.println("Is "+dt+" a valid date format? "+p);
      else
        System.out.println("Is "+dt+" a valid date format? "+p);
                

        
        
    }
}