package Arrays;
import java.util.Scanner;
public class missing {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the n value");
       int n=sc.nextInt();
       int[] a=new int[n];
       for(int i=0;i<a.length-1;i++)
       {
        a[i]=sc.nextInt();
       }
       int sum=0;
       for(int i=0;i<a.length-1;i++)
       
       {
        sum=sum+a[i];
       }
       int b=(n*(n+1))/2;
       System.out.println(b-sum);
     


    }
}
