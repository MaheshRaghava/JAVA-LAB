import java.util.*;
class binarysearch
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int i;
    System.out.println("Enter the elements : ");
    for (i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    int start = 0, end = n - 1, mid;
    int pos = -1;
    System.out.println("Enter element to search : ");
    int ele = sc.nextInt();
    while (start <= end) 
    {
      mid = (start + end) / 2;
      if (arr[mid] == ele)
      {
        pos = mid + 1;
        break;
      }
      else if (ele < arr[mid])
      {
        end = mid - 1;
      } 
      else 
      {
        start = mid + 1;
      }
    }
    if (pos > 0)
    {
      System.out.printf("Element found at %d",pos);
    }
    else
    {
      System.out.println("Element is not found");
    }
  }
}




















