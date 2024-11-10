package Arrays;

public class maxsumsubarray {
    public static void main(String[] args) {
        {
            int[] arr={1,2,3,4};
            int ans=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i;j<arr.length;j++)
                {
                  int temp=0;
                for(int k=i;k<=j;k++)
                {
                   temp+=arr[k];
                }
                ans=Math.max(ans,temp);

                }
            }
        
        System.out.println(ans);
        }
    }
}
