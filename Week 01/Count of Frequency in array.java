import java.util.*;
public class CountFreQuency {
    public static void main(String args[]){
        int arr[]={1, 2, 2, 3, 3, 3};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> en : map.entrySet()) {
            System.out.println(en.getKey() + "->" + en.getValue());
        }
    }
}
