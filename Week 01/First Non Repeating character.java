import java.util.*;
public class FirstNonRepeating {
    public static void main(String args[]){
        String s="swiss";
        for(int i=0;i<s.length();i++) {
            boolean flag = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("First Non repeating character " + s.charAt(i));
                return;
            }
        }
                System.out.println("Not found");

        }
    }
// alternative using HashMap

import java.util.*;
public class FirstNonRepeating {
    public static void main(String args[]){
        String s="swiss";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char c:s.toCharArray()){
            if(map.get(c)==1){
                System.out.println("First Non repeating Character : "+c);
                return;
            }
        }
        System.out.println("No such Character found ");
        }
    }


