import java.util.*;
class MUL
{
 void mul(int a,int b)
 {
   System.out.println("Multiplication is :"+(a*b));
 }
 void mul(int a,int b,int c)
 {
   System.out.println("Multiplication is :"+(a*b*c));
 }
 public static void main(String args[])
 {
  MUL Obj=new MUL();
  Obj.mul(2,8);
  Obj.mul(1,4,3);
  }
}
