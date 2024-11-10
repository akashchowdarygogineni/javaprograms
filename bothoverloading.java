package Arrays;
public class bothoverloading{
int  info(int a,int b)
{
    return (a+b);
}
void info(int a,int b,int c)
{
    System.out.println(a+b+c);
}
bothoverloading(int a,int b)
{
    System.out.println(a+b);
}
bothoverloading(int d,int e,int f)
{
    System.out.println(d+e+f);
}
} 




class object{
 public static void main(String[] args)
    {
        bothoverloading ac=new bothoverloading(1,2);//basic method oveloading and constructor overloading taking input values as arguments
      ac.info(1,2);
      bothoverloading da=new bothoverloading(2,3,4);
      da.info(4,5,6);
    }
}






