import java.util.*;
class strong
{
 public static void main(String args[])
 {
  int n,d,temp,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number: ");
  n=sc.nextInt();
  temp=n;
  while(n>0)
  {
   int i,f=1;
   d=n%10;
   for(i=1;i<=d;i++)
   {
   f=f*i;
   }
   sum=sum+f;
   n=n/10;
   }
   if(temp==sum)
   {
   System.out.println("Strong Number");
   }
   else
   {
   System.out.println("Not A Strong Number");
   }
 }
}  
  
