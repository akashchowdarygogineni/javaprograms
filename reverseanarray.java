package Arrays;
import java.util.Scanner;
public class reverseanarray {
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of values");
        int n=sc.nextInt();
        int[] arr=new int[10];
        int temp;
        
        System.out.println("enter the array values");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;//doubt second method

        }
        System.out.println("array after reverse");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();

        }
    
}
