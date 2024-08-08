import java.util.*;
class palindrome
{
 public static void main(String args[])
 {
  int n,rem,temp,rev=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number: ");
  n=sc.nextInt();
  temp=n;
  while(n>0)
  {
   rem=n%10;
   rev=rev*10+rem;
   n=n/10;
   }
   if(temp==rev)
   {
   System.out.println("Palindrome Number");
   }
   else
   {
   System.out.println("Not A Palindrome Number");
   }
 }
}  
  
