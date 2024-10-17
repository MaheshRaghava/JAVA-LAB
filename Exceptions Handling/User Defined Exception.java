//User Defined Exception
class Userdefined
{
  public static void validate(int age)
  {
    if(age<18)
    {
      throw new ArithmeticException("Not Eligible To Vote");
    }
    else
    {
      System.out.println("Eligible To Vote");
    }
  }
  public static void main(String args[])
  {
    validate(28);
  }
}
