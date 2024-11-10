package Arrays;

public class builder {
    public static void main(String[] args) {
          
    StringBuilder sb=new StringBuilder("akash");
    sb.append("world");
    System.out.println(sb.toString());
    String name="akash";
    String upper=name.toUpperCase();
    System.out.println(upper);
    String lower=upper.toLowerCase();
    System.out.println(lower);
    System.out.println(lower.replace('a','o'));
    System.out.println(upper.concat(name));
    String na=" cho ";
    
    System.out.println(na.trim());
    String nan=" cric";
    System.out.println(nan.trim());
        
    }
    

}
