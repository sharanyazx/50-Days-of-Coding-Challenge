public class MoveZeros {
    public static void main(String[] args) {
        int []arr={1,0,7,4,0,2};
        int j =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            else if (arr[j]!=0){
                j++;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
