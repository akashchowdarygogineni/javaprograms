


package Arrays;
class example1 extends Thread{
    
    public void info()
    {
        try {
            for(int i=1;i<=5;i++)
            {
                System.out.println(i+Thread.currentThread().getId());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

public class mutilthreading1 {
    public static void main(String[] args)
    {
        example1 obj=new example1();//thread one starts here
        example1 obj1=new example1();//thread 2 starts here

        obj.start();
        try {
            obj.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        obj1.start();
        
    }
}

