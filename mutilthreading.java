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

public class mutilthreading {
    public static void main(String[] args)
    {
        example1 obj=new example1();
        example1 obj1=new example1();
        obj.start();
        obj1.start();
        
    }
}
