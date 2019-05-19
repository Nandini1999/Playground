//import required packages
import java.util.*;
class Faculty
{
  long sala;
  public void salary(long sal)
  { 
    this.sala=sal;
  }
}
class CSE extends Faculty
{
  public void salary(long sal)
  {
  Faculty f=new Faculty();
  f.salary(sal);
  long saal=f.sala+3000;
  System.out.println("\nCSE Faculty: " +saal);
    //write your CSE class statements
  }
}
class IT extends Faculty
{
  public void salary(long sal)
  {
  Faculty f=new Faculty();
  f.salary(sal);
  long saal=f.sala+5000;
  System.out.println("IT Faculty: " +saal);
    //write your IT class statements
  }
}
class ECE extends Faculty
{
  public void salary(long sal)
  {
    //write your ECE class statements
     Faculty f=new Faculty();
    f.salary(sal);
    long saal=f.sala+4500;
    System.out.println("ECE Faculty: " +saal);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    long sal=sc.nextLong();
     System.out.print("Base Salary: "+sal);
    CSE obj = new CSE();
    obj.salary(sal);
    IT o=new IT();
    o.salary(sal);
    ECE os=new ECE();
    os.salary(sal);
    //implement your required concept here
  }
}