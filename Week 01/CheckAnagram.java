import java.util.*;
public class CheckAnagram {
    public static void main(String args[]){
        String s1="listen";
        String s2="silent";
      // if differ case  
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
      
        char[] ch1=s1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
