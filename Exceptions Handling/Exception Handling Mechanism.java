//Exception Handling Mechanism
import java.lang.*;
class TryCatch
{
   public static void main(String args[])
      { 
        int x;
        int a=10,b=5,c=5;
        try  
        {  
           x=a/(b-c);
           System.out.println(x); 
           
        }   
        catch(ArithmeticException e)  
        {  
            System.out.println("Exception Handled"); 
            System.out.println(e);  
        }     
      }
}
