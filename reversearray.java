// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package Arrays;
import java.util.Scanner;
public class reversearray {
    public static void main(String[] args) {
        
        int[] arr=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of values");
        int n=sc.nextInt();
        
        System.out.println("enter the array values");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("array before reverse");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");

        }
        System.out.println("array after reverse");
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(arr[i]+" ");
        }
        sc.close();

        }
    
}
