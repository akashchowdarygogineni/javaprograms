
package Arrays;
class employee{
    public void main()
    {
        System.out.println("this is an employee");
    }
}
class contractemployee extends employee{
    public void info(String benifits,int lowsalary,int lesstimeperiod)
    {
        System.out.println("this is a contractemployee");
        System.out.println("the benifits of contract emloyee is "+benifits);
        System.out.println(" salary of contract employee is low "+lowsalary);
        System.out.println("time period of contract employee is "+lesstimeperiod);
    }
}
class perminantemployee extends employee{
    public void emp(String lessbenifits,int highsalary,int timeperiod)
    {
        System.out.println("this is perminant employee");
        System.out.println("the benifits of perminant employee is "+lessbenifits);
        System.out.println("salary of perminant employee is "+highsalary);
        System.out.println("time period of perminant employee "+timeperiod);
    }
}
public class hierachialinheritance{
    public static void main(String[] args) {
        perminantemployee p=new perminantemployee();
        p.emp("insurance",30000,50);
        p.main();
        contractemployee s=new contractemployee();
        s.info("extra_bonus",300,1); 


    
        
    }

}

