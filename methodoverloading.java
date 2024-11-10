package Arrays;
import java.util.Scanner;
public class methodoverloading{
static void info(int a,int b)
{
    System.out.println(a+b);
}
void info(int a,int b,int c)
{
    System.out.println(a+b+c);
}
void info(double d,double e)
      {
        System.out.println(d-e);
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
        double d=sc.nextDouble();
        System.out.println("enter the e value");
        Double e=sc.nextDouble();

        methodoverloading ac=new methodoverloading();//basic method oveloading taking input valuesfrom the user
      methodoverloading.info(a,b);//we use static the we dont create object and call the method by using class name
      ac.info(a,b,c);
      ac.info(d,e);
    }
}




