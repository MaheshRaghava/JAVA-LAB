class A
{
 A()
 {
  System.out.println("constructor");
 }
 A(int n)
 {
 System.out.println("Number is "+n);
 }
 public static void main(String args[])
 {
 A Obj1=new A();
 A Obj2=new A(28);
 }
}
