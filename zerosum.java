package Arrays;
import java.util.Scanner;

public class zerosum {
     public static void main(String[] args) {
         int[] arr=new int[5];
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the valuesof the array");
         for(int i=0;i<arr.length;i++)
         {
            arr[i]=sc.nextInt();
         }
         
         
         for(int i=0;i<arr.length;i++)
         {
            
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==0)
                {
                    System.out.println(arr[i]+","+arr[j]);
                 
                
                }
            
                

              
            }
         
        
          
         }
     
        
     }
    }
 


    

