package Arrays;

public class largeststring {
    public static void main(String[] args) {
        String[] word={"akash","ramakrishna","krishnamraju"};
        int len=0;
        String s=" ";
        for(int i=0;i<word.length;i++)
        {
            if(word[i].length()>len)
            {
                s=word[i];
                len=word[i].length();
            }
        }
        System.out.println(s);
    }
}
