package Arrays;

public class shortestpath {
    public static void main(String[] args) {
        String name="wwwwnnnnseee";
        int x=0;
        int y=0;
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if(ch =='w')
            {
                x--;
            }
            else if(ch=='n')
            {
                y++;
            }
            else if(ch=='s')
            {
                y--;
            }
            else if(ch=='e'){
                x++;

            }
        }
        double value=Math.sqrt(y*y-x*x);
        System.out.println(value);

        
    }
    
}
