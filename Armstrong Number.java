import java.util.*;
class armstrong
{
 public static void main(String args[])
 {
  int n,d,rem,temp,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number: ");
  n=sc.nextInt();
  d=String.valueOf(n).length();
  temp=n;
  while(n>0)
  {
   rem=n%10;
   sum+=Math.pow(rem,d);
   n=n/10;
   }
   if(temp==sum)
   {
   System.out.println("Armstrong Number");
   }
   else
   {
   System.out.println("Not A Armstrong Number");
   }
 }
}  
  
