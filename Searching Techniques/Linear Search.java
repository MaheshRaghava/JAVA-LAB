import java.util.*;
class linearsearch
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   int i,count=0;
   System.out.println("Enter size of array : ");
   int n=sc.nextInt();
   System.out.println("Enter the elements : ");
   int arr[] = new int[n];
   for(i=0;i<arr.length;i++)
   {
    arr[i]=sc.nextInt();
   }
   System.out.println("Enter the element to search : ");
   int search = sc.nextInt();
   for(i=0;i<arr.length;i++)
   {
    if(search==arr[i])
    {
     System.out.println("Element found at "+ i +" index");
     count++;
     break;
    }
   }
   if(count==0)
   {
    System.out.println("Element not found");
   }
  }
}
