package Arrays;

public class movezeros {
    public static void main(String[] args) {
        int[] arr={1,2,0,3,4,5,0,6};
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }

        }
        int temp;
        for(int i=j+1;i<arr.length;i++)
        {
            if(arr[j]==0 && arr[i]!=0)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++; 
            }
            
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
  
}
