package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class peakelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//peakelement is performed for the unsorted array
        int[] arr1=new int[10];
        System.out.println("enter the values of the array");//peak element in the array means the element that is greater than the neibhouring elements
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();//if the input array is in the sorted order(increasing) than the last element is peaked element and viceversa for decreasing order
        }
        Arrays.sort(arr1);
        //if the input array all the elements are equal than any one is the peakelement
        System.out.println(arr1[arr1.length-1]);


    }
    
}
