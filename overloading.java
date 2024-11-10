package Arrays;
import java.util.Scanner;
public class overloading{
void info(int a,int b)
{
    System.out.println(a+b);
}
void info(int a,int b,int c)
{
    System.out.println(a+b+c);
}
overloading(int a,int b)
{
    System.out.println(a+b);
}
overloading(int d,int e,int f)
{
    System.out.println(d+e+f);
}



 public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a value");
        int a=sc.nextInt();
        System.out.println("enter the b value");
        int b=sc.nextInt();
        System.out.println("enter the c value");
        int c=sc.nextInt();
        System.out.println("enter the d value");
        int d=sc.nextInt();
        System.out.println("enter the e value");
        int e=sc.nextInt();
        System.out.println("enter the f value");
        int f=sc.nextInt();
        overloading ac=new overloading(a,b);//basic method oveloading and constructor overloading taking input valuesfrom the user
      ac.info(a,b);
      overloading da=new overloading(d,e,f);
      da.info(a,b,c);
    }
}





