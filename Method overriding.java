import java.util.*;
class vehicle
{
 void run()
 {
   System.out.println("Vehicle is running");
 }
}
class bike extends vehicle
{
 void run()
   {
   System.out.println("Bike is running");
   }
 public static void main(String args[])
 {
   bike Obj=new bike();
   Obj.run(); 
 }
}
