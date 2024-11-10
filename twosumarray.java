
package Arrays;
import java.util.Scanner;
public class twosumarray {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {    
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("yes");
                    System.out.println(i+","+j);
                }
             


            }
        }

    }

    
}
