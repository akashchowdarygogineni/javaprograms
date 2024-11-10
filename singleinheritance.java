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
public class singleinheritance{
    public static void main(String[] args) {
        dog p=new dog();
        p.info();
        p.main();
    }

}