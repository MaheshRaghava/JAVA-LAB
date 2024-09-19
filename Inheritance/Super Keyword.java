//Variable Level
class employee
{
  double salary=12428.30;
}
class HR extends employee
{
  double salary=22428.30;
  void display()
  {
   System.out.println("HR salary is : "+salary);
   System.out.println("Employee salary is : "+super.salary);
  }
  public static void main(String args[])
  {
   HR obj=new HR();
   obj.display();
  }
}
//Method Level
class student
{
 public void message()
 {
  System.out.println("Hello");
 }
}
class faculty extends student
{
 public void message()
 {
  System.out.println("Cutie");
 }
 void display()
 {
  super.message();
  message();
 }
 public static void main(String args[])
 {
  faculty obj=new faculty();
  obj.display();
 }
}
//Constructor Level
class A
{
 A()
 {
  System.out.println("Parent Constructor");
 }
}
class B extends A
{
 B()
 {
 super();
 System.out.println("Child Constructor");
 }
 public static void main(String args[])
 {
  B obj=new B();
 }
}
