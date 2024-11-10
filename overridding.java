package Arrays;

class parent {

    void info()
    {
        System.out.println("parent class");
    }
}
class child extends parent
{
    void info()
    {
        System.out.println("child class"); 
    }
}
public class overridding{
    public static void main(String[] args) {
        parent ac=new child();
        ac.info();
        
        child b=new child();//over ridding in polymorphism by method not possible for constructors
        b.info();
        parent a=new parent();
        a.info();
        
        

        
    }

}
