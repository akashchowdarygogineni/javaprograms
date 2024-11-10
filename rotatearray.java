package Arrays;

public class rotatearray {
    public static void main(String[] args) {
        
       int[] arr={1,2,3,4,5};
       for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]+" ");
       }
       System.out.println("");
       int temp=arr[0];
       for(int i=1;i<arr.length;i++)
       {
          arr[i-1]=arr[i];
       }
       arr[arr.length-1]=temp;
       for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]+" ");
       }
        
    }
   
}
