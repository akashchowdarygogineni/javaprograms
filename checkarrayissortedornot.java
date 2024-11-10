package Arrays;

public class checkarrayissortedornot {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7};
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");//so we can check the given array is sorted or not using the array methods or we can use the general method
    }
}
