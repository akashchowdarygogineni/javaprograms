package Arrays;

public class binarysearch {
    public static void main(String[] args) {
        /*
         1. array should be sorted order
         2.mid,last,first
         */
    
        int[] arr={1,2,3,4,5,6,7};
        int k=6;
        int ind=search(arr,k);
        System.out.println(ind);//binary search using functions
        }
        static int search(int[] arr,int k)
        {
            int mid,low=0,high=arr.length-1;
            while(low<=high)
            {
            mid=(low+high)/2;
            
             if(arr[mid]==k)
             {
                return mid;
             }
             else if(arr[mid]<k)
             {
                   low=mid+1;
             }
             else if(arr[mid]>k)
             {
                high=mid-1;
             }
            }
            return -1;
        }
    }          



 