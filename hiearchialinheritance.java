package Arrays;
class animal{
    public void main()
    {
        System.out.println("this is an animal");
    }
}
class blackdog extends animal{
    public void info()
    {
        System.out.println("this is a dog");
    }
}
class whitedog extends animal{
   public  void ani()
   {
 
    System.out.println("this is baby dog");
    }
}


public class hiearchialinheritance{
    public static void main(String[] args) {
        whitedog p=new whitedog();
        p.ani();
        p.main();
        blackdog s=new blackdog();
        s.info();
        

    }

}

