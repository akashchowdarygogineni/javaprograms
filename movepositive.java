package Arrays;

public class movepositive {
    public static void main(String[] args)
    {
        int[] arr={-4,-3,1,2,-2,5};
        int a=arr.length;
        int start=0;
        int end=a-1;
        int k;
        while(start<=end)
        {
            if(arr[start]<0 && arr[end]<0)
            {
                start++;
            }
            if(arr[start]>0 && arr[end]<0)
            {
              k=arr[start];
              arr[start]=arr[end];
              arr[end]=k;
              start++;
              end--;
            }
            if(arr[start]>0 && arr[end]>0)
            {
                end--;
            }
            if(arr[start]<0 && arr[end]>0)
            {
              k=arr[start];
              arr[start]=arr[end];
              arr[end]=k;
              start++;
              end--;
            }
            System.out.println(arr);
 
        }
    }
}
