package Arrays;
import java.util.Scanner;


public class intersectionoftwoarrays {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("enter the array values");
        for(int i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
        int[] b=new int[3];
        System.out.println("enter the values of array");
        for(int j=0;j<b.length;j++)
        {
            b[j]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++ )
            {
                if(a[i]==b[j])
                {
                    System.out.println(a[i]);
                }
            }
        }

    }
}
