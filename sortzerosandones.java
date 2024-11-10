package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class sortzerosandones {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int[] arr=new int[5];
      System.out.println("enter the elements in the given array");//we want gave the inputs including zeros and ones in unsorted array
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
      for(int i=0;i<arr.length;i++)
      {
      System.out.println(arr[i]);
      }

    }
}
