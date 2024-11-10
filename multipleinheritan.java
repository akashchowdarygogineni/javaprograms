package Arrays;
interface walk{
    public void info();
}
interface swim{
    public void intinfo();
}
class duck implements walk,swim{
    public void info(){
        System.out.println("duck walks for sometime");
    }
    public void intinfo(){
        System.out.println("the duck also swim");
    }
    public void id()
    {
        System.out.println("the duck swims and walks");
    }
} 
public class multipleinheritan{
    public static void main(String[] args)
    {
        duck p=new duck();
        p.info();
        p.intinfo();
        p.id();
        
    }
    
}
















