package Arrays;

public class searcinrotatedarray {
    public static void main(String[] args)
    {
        int[] arr={4,5,6,1,2,3};
        int target=5;
        int l=0;
        int h=arr.length-1;
        int mid;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(arr[mid]==target)
            {
                System.out.println("yes");
                break;
            }
            else if(arr[l]<=arr[mid])
            {
                if(target>=arr[l] && target<arr[mid])
                {
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else if(arr[mid]<=arr[h])
            {
               if(target>arr[mid] && target<=arr[h])
               {
                l=mid+1;
               }
               else{
                h=mid-1;
               }
            }
        }

    }
    
}
