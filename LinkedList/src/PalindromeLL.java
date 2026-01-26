import java.util.*;

public class PalindromeLL
{
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static Node reverse(Node head){
        Node pre = null;
        Node curr = head;
        Node Next = head;
        while(Next!=null){
            Next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=Next;
        }
        return pre;  // pre become new head
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();
        System.out.println("Enter nodes ");
        Node head = new Node(sc.nextInt());
        Node temp = head;
        for(int i=1;i<n;i++){
            Node a = new Node(sc.nextInt());
            temp.next = a;
            temp = temp.next;
        }
        temp.next=null;

        Node slow= head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node j = reverse(slow);
        Node i = head;
        boolean flag= true;
        while(j!=null){
            if(i.val!=j.val) flag= false;
            i=i.next;
            j=j.next;
        }

        if(flag){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}
