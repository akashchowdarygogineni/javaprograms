package Arrays;
import java.util.Scanner;

public class countoccurence {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sa.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sa.nextInt();

        }
        System.out.println("enter the element");//it counts the number of times given element is present in the given array
        int a=sa.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==a)
            {
                count++;
            }
        }
        System.out.println(count);

    }
    
}
