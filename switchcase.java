package Arrays;
import java.util.Scanner;
public class switchcase{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the a value");
            int a=sc.nextInt();
            System.out.println("enter the b value");
            int b=sc.nextInt();
            System.out.println("enter the operation");
            char operator=sc.next().charAt(0);//taking chracter input in java
            int result;

            switch (operator)
            { 
                case '+':
                         result=a+b;
                         System.out.println(a+"+"+b+"="+result);
                         break;
                case '-':
                         result=a-b;
                         System.out.println(a+"-"+b+"="+result);
                         break;
                case '*':
                         result=a*b;
                         System.out.println(a+"*"+b+"="+result);
                         break;
                case '/':
                         result=a/b;
                         System.out.println(a+"/"+b+"="+result);
                         break;
                default:
                        System.out.println("invalid operator");
                        break;
                       
            
            }
            sc.close();
            

        }
    }
}