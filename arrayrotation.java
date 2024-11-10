package Arrays;

public class arrayrotation {

    public static void main(String[] args) {
       int k=4; 
       int[] arr={1,2,3,4,5};
       for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]+" ");
       }
       System.out.println("");

       if(k<0)
       {
        k=k+arr.length;
       }
       else
       {
        k=k%arr.length;
       }

       int temp=arr[0];
for(int i=1;i<=k;i++)
{
 for(int i=1;i<arr.length;i++)
       {
          arr[i-1]=arr[i];
       }
       arr[arr.length-1]=temp;
}




       for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]+" ");
       }
        
    }
   
}


