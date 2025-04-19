public class MajorityElement {
    public static void main(String args[]){
        int count=0,candidate=0;
        int a[]={2,2,1,1,1,2,2};
        for(int element:a){
            if(count==0){
                candidate=element;
            }
            if(i==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        for(int element:a){
            if(i==candidate){
                count++;
            }
        }
        if(count>a.length/2){
            System.out.println("Majority element "+ candidate);
        }
    }
}
