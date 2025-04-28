import javax.lang.model.element.Element;

// Node class definition
class LLNode {
    int data;
    LLNode next;
    // Constructor with both data and next pointer
    LLNode(int data1, LLNode next1) {
        this.data = data1;
        this.next = next1;
    }
    // Constructor with only data (next pointer set to null)
    LLNode(int data1) {
        this.data = data1;
        this.next = null;
    }
}

// LinkedList class
public class Deletion {
    public static LLNode conver(int[] arr){
        LLNode head = new LLNode(arr[0]);  // head = [2 | null]
        LLNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            LLNode temp = new LLNode(arr[i]);  // temp = [5], [6], [8]
            curr.next = temp;              // link nodes
            curr = temp;                   // move current to last node
        }
        return head;
    }

    /* ----------------------DELETION AT BEGINNING -------------------------*/
    public static LLNode deletehead(LLNode head) {
        System.out.println("After Deletion of head");
        if (head == null) return head;
        head = head.next;
        return head;
    }
    /* -----------------------------------------------*/

    /* ----------------------DELETION AT END -------------------------*/
    // Function to delete the tail of the linked list
    public static LLNode deleteTail(LLNode head) {
        System.out.println("After Deletion of tail");
        if (head == null || head.next == null)
            return null;
        LLNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    /* -----------------------------------------------*/
    public static LLNode DeletePosition(LLNode head,int position){
        LLNode temp=head,prev=null;
        System.out.println("After deletion of given Position ");
        if (head == null) return null;
        if (position == 1) {
            return deletehead(head);// delete head
        }
        int count=0;
        while(temp!=null){
            count++;
            if(count==position){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    public static LLNode DeleteElement(LLNode head,int value){
        LLNode temp=head,prev=null;
        System.out.println("After deletion of given value ");
        if (head == null) return null;
        if (head.data == value) {
            return deletehead(head);// delete head
        }
        while(temp!=null){

            if(temp.data==value){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    // Function to print the linked list
    public static void printLL(LLNode head) {
        LLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7,1,9,10};
        System.out.print("Array Elements ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        LLNode head = conver(arr);

        System.out.println();
        head = deletehead(head);
        printLL(head);

        System.out.println();

        head = deleteTail(head);
        printLL(head);

        System.out.println();
        head=DeletePosition(head,4);
        printLL(head);

        System.out.println();
        head=DeleteElement(head,7);
        printLL(head);
    }
}
/* 
OUTPUT 
"C:\Program Files\Java\jdk-23\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.2\lib\idea_rt.jar=59098:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\A\IdeaProjects\Strivers DSA\out\production\Strivers DSA" Deletion
Array Elements 2 5 8 7 1 9 10 

After Deletion of head
5->8->7->1->9->10->null
After Deletion of tail
5->8->7->1->9->null
After deletion of given Position 
5->8->7->9->null
After deletion of given value 
5->8->9->null
Process finished with exit code 0
*/
