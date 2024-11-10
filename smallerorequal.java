package Arrays;

import java.util.Scanner;


public class smallerorequal {
    public static void main(String[] args)
    {
        int[] arr={1,3,5,6,8};
        int count=0;
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=k)
            {
                count++;
            }
        }
        System.out.println(count);
    
    }
    
}
