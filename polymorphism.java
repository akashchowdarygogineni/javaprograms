package Arrays;
public class polymorphism{

 void  info(int a,int b)
{
    System.out.println(a+b);
}
polymorphism(int a,int b,int c)
{
    System.out.println(a-b-c);
}



 public static void main(String[] args)
    {
      polymorphism sc=new polymorphism(1,2,3);//basic method and constructor creation and display the output using object creation
    sc.info(1,2);//we use static we call the method by calling using class name
    }
}




