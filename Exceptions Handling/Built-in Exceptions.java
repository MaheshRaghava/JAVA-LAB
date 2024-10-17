//Built in Exceptions
import java.lang.*;
class BuiltinExceptions
{ 
  public static void main(String args[])
  {
     try
      {
        int a=24/0;
        System.out.println(a);
      }
     catch(ArithmeticException e)
      {
        System.out.println(e);
      }
    try
      {
        int b[]=new int [5];
        System.out.println(b[10]);
      }
    catch(ArrayIndexOutOfBoundsException e)
     {
       System.out.println(e);
     }
    try
      {
        String c="Mahesh";
        int n=Integer.parseInt(c);
      }
    catch(NumberFormatException e)
      {
        System.out.println(e);
      }
    try
      {
        String d=null;
        System.out.println(d.length());
      }
    catch(NullPointerException e)
      {
        System.out.println(e);
      }
        System.out.println("Hello Cutie");
  } 
}
    
      
      
      
      
      
      
      
      
      
      
