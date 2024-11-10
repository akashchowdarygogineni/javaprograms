package Arrays;
import java.util.Scanner;
public class polysum{
void info(int a,int b)
{
    System.out.println(a+b);
}
polysum(int a,int b)
{
    System.out.println(a-b);
}



 public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a value");
        int a=sc.nextInt();
        System.out.println("enter the b value");
        int b=sc.nextInt();

        polysum ac=new polysum(a,b);//basic method and constructor using parameters and scanner class by taking input values
      ac.info(a,b);
    }
}




