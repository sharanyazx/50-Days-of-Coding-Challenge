import java.util.*;
public class ReverseWords {
    public static void main(String args []){
        String s="I love coding";
        String []words=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for (int i= words.length-1;i>=0;i--){
            sb.append(words[i]+" ");
        }
        System.out.println("Original Sentence: "+s);
        System.out.println("After Reversing :"+sb); // coding love I


    }
}
