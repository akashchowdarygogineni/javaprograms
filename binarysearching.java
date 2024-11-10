
import java.util.Scanner;
package Arrays;

public class binarysearching {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array values");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();//taking values from the user
        }
        System.out.println("enter the element you want to search");
        int search=sc.nextInt();
        int low=0;
        int mid;
        int high=arr.length-1;//it is interview point of question very important//in compiler we first write import java.util.Arrays instead of package
        while(low<=high){
         mid=(low+high)/2;
         if(arr[mid]==search)
         {
            System.out.println(mid);
            break;
         }
         else if(arr[mid]<search)
         {
            low=mid+1;
         }
         else if(arr[mid]>search)
         {
            high=mid-1;
         }
         else
         {
            System.out.println("no element found");
         }                                                                                                                                                  
        

        }
        
    }
    
}
