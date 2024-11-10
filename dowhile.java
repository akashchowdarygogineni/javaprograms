package Arrays;
import java.util.Scanner;
public class dowhile{
public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the n value");
      int n=sc.nextInt();
      int sum=0;
      int i=1;
      do
      {
        sum=sum+i;
        i+=1;
      }while(i<=n);
      System.out.println(sum);
      

              

     }
}