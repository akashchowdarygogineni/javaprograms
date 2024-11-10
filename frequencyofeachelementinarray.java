package Arrays;

public class frequencyofeachelementinarray {
    
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,1,2};
        
        for(int i=0;i<arr.length;i++)
        {   
            int count=1;
            int found=0;
            for(int j=0;j<arr.length;j++)
            {
                if(j>=i)
                {
                    if(arr[i]==arr[j] && i!=j)
                    {
                        count++;
                    }
                }
                else if(arr[i]==arr[j])
                {
                    found=1;
                }
            }
            if(found!=1)
            {
            System.out.println(arr[i]+",occurs"+count+"times");
            }
        }

    }
}
