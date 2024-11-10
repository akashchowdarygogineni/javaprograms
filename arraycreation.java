package Arrays;

public class arraycreation {
    public static void main(String[] args)
    {
        int[] arr=new int[10];

        
        int[] a={1,5,4,3,6,7,8};//basic array creation in java with two types
        System.out.println(a[0]);
        a[3]=7;
        for(int i=0;i<=6;i++)
        {
            a[i]=1;//all the vlues of the array are changed to one through accesing//updating values in the arrays
            System.out.println(a[i]);//firstway
        }
        for(Integer i:a)
        {
            System.out.println(i);//secondway
        }

    }
     
}
 

  