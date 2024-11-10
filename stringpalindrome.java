package Arrays;

public class stringpalindrome {
    public static void main(String[] args){
        String name="ror";
        
    
        
        int n=name.length();
        for(int i=0;i<n/2;i++)
        {
            if(name.charAt(i)!=name.charAt(n-i-1))
            {
               System.out.println("false");
               break;
            }
            else{

                System.out.println("true");

            } 
         

        }
  
    }
    
    
           
    }

