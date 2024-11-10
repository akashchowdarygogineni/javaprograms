package Arrays;
class nuvvuchinnapillavadivi extends Exception{
    nuvvuchinnapillavadivi(String s)
    {
        System.out.println(s);
    }
}

public class exceptionhandling1 {
    void vote(int age) throws nuvvuchinnapillavadivi
    {
        if(age<18)
        {
            throw new nuvvuchinnapillavadivi("your age is not suffiicient");
        }
        else{
            System.out.println("you are eligible to vote");
        }
    }
    public static void main(String[] args)
    {
       exceptionhandling1 obj=new exceptionhandling1();
       try {
          obj.vote(20); 
       } catch (Exception e) {
        System.out.println(e);
       }
       finally{
        System.out.println("thank you");
       }
    }
    
}
