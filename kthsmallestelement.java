package Arrays;
    
import java.util.Arrays;
import java.util.Scanner;
public class kthsmallestelement {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//kth smallest element is performed for the unsorted array
        int[] arr1=new int[10];
        System.out.println("enter the values of the array");//kth smallest means the value of k should be less than the length of the array
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();//that means we want sort the given array then write arr[k-1] to get kth smallest element in the array
        }
        Arrays.sort(arr1);
        System.out.println("enter the k value");
        int k=sc.nextInt();
        System.out.println(arr1[k-1]);
    }
}


