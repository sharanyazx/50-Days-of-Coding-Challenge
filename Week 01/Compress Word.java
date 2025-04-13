public class StringCompression {
    public static void main(String args[]){
        String s="aaabbc";
        StringBuilder compress=new StringBuilder();
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                compress.append(s.charAt(i-1));
                compress.append(count);
                count=1;
            }

        }
        compress.append(s.charAt(s.length()-1));
        compress.append(count);
        System.out.println("Before compression :"+s);
        System.out.println("After compression  :"+compress);
    }
}
