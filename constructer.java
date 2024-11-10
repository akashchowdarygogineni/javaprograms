package Arrays;
public class constructer {
    int a;
    int b;

    constructer(){//parameterless constructer

    System.out.println("this is hello world");
    }

    constructer(int a,int b) {//parametrized constructer
        System.out.println("i am  paramerrized constructer");
        this.a = a;
        
    }
    
    public static void main(String[] args)
    {
        constructer p=new constructer();
        constructer r=new constructer();
        constructer n=new constructer();
        constructer t=new constructer();
        constructer l=new constructer(25,24);
        System.out.println(l.a);
        System.out.println(l.b);//there is default constructer when we create an object else when we create paramerized or parameterless then there is no default constructer
      
    }
}
