package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class twosumarray1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        Arrays.sort(arr);
        int target=sc.nextInt();
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            if(arr[left]+arr[right]==target)
            {
                System.out.println(left+","+right);
                System.out.println("yes");
                break;

            }
            else if(arr[left]+arr[right]<target)
            {
                left++;

            }
            else
            {
                right--;
            }
        }
  
    }
}
