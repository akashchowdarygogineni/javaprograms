package Arrays;
import java.util.Scanner;

public class rotatentimes {
    static void rotate(int[] arr)
    {
    int temp=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        arr[i-1]=arr[i];
    }
    arr[arr.length-1]=temp;
    
}
static void roone(int[] arr,int k)
{
   if(k<0)
   {
    k=k+arr.length;
   }
   else{
    k=k%arr.length;
   }
   for(int i=1;i<=k;i++)
   {
    rotate(k);

   }

   
}



public static void main(String[] args)
{
    int[] arr={1,2,3,4,5};
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }
    System.out.println(" ");
    rotate(arr,k);

}
