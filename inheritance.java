package Arrays;
//inheritance is of three types 1.singlelevel inheritaceeg.parent ,child 2.multilevelinheritance eg parent,child1,child2 3.hiearichal inheritance eg parent
class vehicle{
    int nowheels;
    String mode;
    void start()
    {
        System.err.println("starting car");
    }
    void stop()
    {
        System.out.println("stoping car");
    }
}
class car extends vehicle{
    int millage;
    void info(){
        System.out.println("Applying brakes to the car");
    }

}
public class inheritance {
    public static void main(String[] args) {
        car nc=new car();
        nc.nowheels=4;
        System.err.println("nc.nowheels");
        nc.info();
        nc.start();
        nc.stop();//creating the object for the last child class and calling the parent class using the object in single and multilevel inheritance
      //but in hiearchial inheritance we can crete the object for child class calling cclass and parentclass then creating object for the parentclass and calling the preparentclass
        
    }
}
