package Arrays;
import java.util.Scanner;
public class constructoroverloading{
constructoroverloading(int a,int b)
{
    System.out.println(a+b);
}
constructoroverloading(int a,int b,int c)
{
    System.out.println(a+b+c);
}
}

class akash{
 public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a value");
        int a=sc.nextInt();
        System.out.println("enter the b value");
        int b=sc.nextInt();
        System.out.println("enter the c value");
        int c=sc.nextInt();

        constructoroverloading ac=new constructoroverloading(a,b);
        constructoroverloading r=new constructoroverloading(a,b,c);//basic constructor oveloading taking input valuesfrom the user
      
    }
}




