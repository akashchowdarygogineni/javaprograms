package Arrays;

public class firstandlast {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,3,3,6};
        int k=3;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==k)
           {
            System.out.println(i);
            break;
           }
        }
        for(int j=arr.length-1;j>=0;j--)
        {
            if(arr[j]==k)
            {
                System.out.println(j);
                break;
            }
        }
    }
}
