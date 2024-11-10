package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class duplicates {
     public static void main(String[] args) {
         int[] arr=new int[5];
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the valuesof the array");
         for(int i=0;i<arr.length;i++)
         {
            arr[i]=sc.nextInt();
         }
         
         Arrays.sort(arr);
         for(int i=0;i<arr.length;i++)
         {
            
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]!=arr[j])
                {
                    System.out.println(arr[i]);
                }
         
            
                

              
            }
          
           
        
          
         }
     
        
     }
    
}
