import java.util.*;
public class SecondLargest {
    public static void main(String args[]){
        int []a={12, 35, 1, 10, 34, 1};
        int largest=Integer.MIN_VALUE;
        int Secondlargest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int Secondsmallest=Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                Secondlargest=largest;
                largest=a[i];
            } else if (a[i]>Secondlargest && a[i]!=largest) {
                Secondlargest=a[i];

            }
            if (a[i]<smallest){
                Secondsmallest=smallest;
                smallest=a[i];
            } else if (a[i]<Secondsmallest && a[i]!=smallest) {
                Secondsmallest=a[i];

            }
        }
        System.out.println(" Largest Element :"+largest +" "+ "\n Second Largest Element :"+Secondlargest);
        System.out.println(" Smallest Element :"+smallest +" "+ "\n Second Smallest Element :"+Secondsmallest);
    }
}

