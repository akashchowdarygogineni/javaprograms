import java.util.Scanner;
public class maxelementinarray {
    public static void main(String[] args)
    {
      int[] arr=new int[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      int max=arr[0];
      int min=arr[0];
      
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]>max)
        {
            max=arr[i];
        }
        else{
            max=arr[0];
        }
        if(arr[i]<min)
        {
            min=arr[i];
        }  
        else{
            min=arr[0];
        }      
      }
      System.out.println(max+","+min);
    }
}
