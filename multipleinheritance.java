package Arrays;
class animal{
    public void main()
    {
        System.out.println("this is an animal");
    }
}
class dog extends animal{
    public void info()
    {
        System.out.println("this is a dog");
    }
}
class babydog extends dog{
   public  void ani()
   {

    System.out.println("this is baby dog");
    }
}
public class multipleinheritance{
    public static void main(String[] args) {
        babydog p=new babydog();
        p.ani();
        p.info();
        p.main();

    }

}
