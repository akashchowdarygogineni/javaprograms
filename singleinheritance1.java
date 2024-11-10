package Arrays;
class employee{
    public void main()
    {
        System.out.println("this is an employee");
    }
}
class contractemployee extends employee{
    public void info()
    {
        System.out.println("this is a contractemployee");
    }
}
public class singleinheritance1{
    public static void main(String[] args) {
        contractemployee p=new contractemployee();
        p.info();
        p.main();
    }

}
