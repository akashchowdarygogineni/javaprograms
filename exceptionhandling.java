package Arrays;
public class exceptionhandling {
    public static void main(String[] args)
   {
      int a=10;
      int b=0;
      int c=0;
      try {
          c=a/b;
      } 
      catch (Exception e) {

         System.out.println("so b is zero when we divides with a then we can said the value it is exception");
      }
      finally{
        System.out.println(c);
      }
   }    
}
