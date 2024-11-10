package Arrays;

public class removeduplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4};
        int[] temp=new int[arr.length];
        
        int j=0;
        temp[j]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(temp[j]!=arr[i])
            {
                j++;
                temp[j]=arr[i];
       

            }
            else if(temp[j]==arr[i])
            {
                i++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
        System.out.println(temp[j]);
        }7
    }
    
}
