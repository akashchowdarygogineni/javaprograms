package Arrays;
interface deposit{
    public void start();
  }
  interface withdrawl{
     public void stop();
  }
  class bankaccount implements deposit,withdrawl{
      public void start(){
          System.out.println("account is started");
      }
      public void stop(){
          System.out.println("account is stopped");
      }
    }
public class in{
          public static void main(String[]aiml){
          bankaccount obj = new bankaccount();
          obj.start();
          obj.stop();
      }
    }
  



