
public class PairSum {
    public static void main(String args[]){
        int a[]={1,2,3,5,8,10,4};
        int sum=12;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==sum){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}
// alternative approach

import java.util.HashSet;
import java.util.Set;

public class PairSum {
    public static void main(String args[]){
        int arr[]={1,2,3,5,8,10,4};
        int sum=12;
        Set<Integer> set=new HashSet<>();
        for(int a:arr){
            //sum=a+b ; 10+2=12  
            //sum-a=b : 12-10=2
            int b=sum-a;  
             if(set.contains(b)){
                System.out.println(a+" "+b);
            }
            else{
                set.add(a);
            }
        }

    }
}

