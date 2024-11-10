package Arrays;

import java.util.Scanner;
class university{

    public void main(String college){
       System.out.println("this is "+college);
    }

}
interface branch{
    public void info(String bname);
}
interface section{
    public void intinfo(String sname);
}
class student extends university implements branch,section{

public void info(String bname){
    System.out.println("the branch name is "+bname);
}
public void intinfo(String sname){
    System.out.println("the section name is "+sname);
}
public void infoying(String stname){
    System.out.println("the student name is "+stname);
}



}

public class hybridinheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the bname");
        String bname=sc.nextLine();
        System.out.println("enter the sname");
        String sname=sc.nextLine();
        System.out.println("enter the stname");
        String stname=sc.nextLine();
        System.out.println("enter the college name");
        String college=sc.nextLine();

        student p=new student();
        p.info(bname);
        p.intinfo(sname);
        p.infoying(stname);
        p.main(college);

   }
    
}
