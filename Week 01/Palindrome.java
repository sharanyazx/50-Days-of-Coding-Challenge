public class Palindrome {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 2, 1};
       if (isPalindrom(arr)){
           System.out.println("given array is a palindrome");
        }
       else{
           System.out.println("Not a palindrome");
       }
    }
        public static boolean isPalindrom(int arr[]){
            int left = 0, right = arr.length - 1;
            while (left < right) {
                if (arr[left] != arr[right]) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
            return true;
        }
    }

