import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
         int n,rem,rev=0;
         Scanner sc =new Scanner(System.in);
         System.out.println("enter number");
         n=sc.nextInt();
         while(n>0)
         {
             rem=n%10;
             rev=rev*10+rem;
             n=n/10;
         }
         
         while(rev>0){
             rem=rev%10;
             System.out.println(rem);
             rev=rev/10;
             
             
         }
         
         }
}
