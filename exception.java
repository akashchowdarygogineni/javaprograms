package Arrays;
import java.util.Scanner;
public class exception {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("enter a number");
            int a=sc.nextInt();
            int b=100/a;
            int[] array = {1,2,3,4,5};
            System.out.println("enter an index 0-4");
            int index= sc.nextInt();
            System.out.println("the element in index is:"+array[index]);
        } 
        catch(ArithmeticException e) {
            System.out.println("it has an exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("it has an array exception");
        }
        finally{
            System.out.println("it is finally executed");
        }
    }
}
