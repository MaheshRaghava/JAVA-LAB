class A
{
  public void methodA()
  {
    System.out.println("Hello");
  }
}
class B extends A
{
 public void methodB()
 {
  System.out.println("Cutie");
 }
}
class C extends B
{
 public void methodC()
 {
  System.out.println("Pie");
 }
 public static void main(String args[])
 {
  C obj=new C();
  obj.methodA();
  obj.methodB();
  obj.methodC();
 }
}
