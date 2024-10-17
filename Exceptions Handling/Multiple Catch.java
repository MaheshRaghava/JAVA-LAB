//Multiple Catch Clauses
import java.lang.*;
class MultipleCatch
{ 
  public static void main(String args[])
  {
    try
    {
      int a=24/0;
      System.out.println(a);
      //int b[]=new int [5];
      //System.out.println(b[10]);
      //String c="Mahesh";
      //int n=Integer.parseInt(c);
      //String d=null;
      //System.out.println(d.length());
       
    }
    catch(ArithmeticException e)
    {
      System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println(e);
    }
    catch(NumberFormatException e)
    {
      System.out.println(e);
    }
    catch(NullPointerException e)
    {
      System.out.println(e);
    }
      System.out.println("Hello Cutie");
  } 
}
    
      
      
      
      
      
      
      
      
      
      
