package Arrays;
import java.util.Scanner;


public class floatandceil {
    public static void main(String[] args) {
        int[] arr=new int[6];
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
        int floatvalue;
         int ceilvalue;
        int high=arr.length-1;//it is interview point of question very important//in compiler we first write import java.util.Arrays instead of package
        while(low<=high){
         mid=(low+high)/2;
         if(arr[mid]==search)
         {
            System.out.println("the float value is"+arr[mid]);
            System.out.println("the ceil value is"+arr[mid]);

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
        if(low<arr.length)
        {
        ceilvalue=arr[low];
        System.out.println("the ceil value is"+ceilvalue);
        }
        else
        {
          System.out.println("no ceil value");
        }
        if(high>=0)
        {
        floatvalue=arr[high];
        System.out.println("the float value is"+floatvalue);
        }
        else
        {
            System.out.println("no float value");
        }


        
    }
    
}
