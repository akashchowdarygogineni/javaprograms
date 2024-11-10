package Arrays;



import java.util.Scanner;
public class binary {

	public static void main(String[] args) {
	
		int[] arr= {1,4,5,6,7};
		int low=0;
		int high=arr.length-1;
		int mid;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element you want to search");
		int k=sc.nextInt();
		while(low<=high)
		{
            mid=(low+high)/2;
			if(arr[mid]==k)
			{
				System.out.println("element found");
				break;
			}
			
			else if(arr[mid]<k)
			{
				low=mid+1;
			}
			else if(arr[mid]>k)
			{
				high=mid-1;
			}
          
			
		}
		if(low>high)
		{
			System.out.println("element not found");
		}
		

	}
}


