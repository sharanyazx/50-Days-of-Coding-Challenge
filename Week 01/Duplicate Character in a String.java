import java.util.*;
public class DuplicatefromString {
    public static void main(String args[]){
        String s="programming";
        Set<Character> set=new LinkedHashSet<>();
        char[] ch=s.toCharArray();
        for(char i:ch){
            set.add(i);
        }
        StringBuilder sb=new StringBuilder();
        for(char i:set){
            sb.append(i);
        }
        System.out.println(sb);  // programin
    }
}
