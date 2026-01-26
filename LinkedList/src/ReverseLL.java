
import java.util.*;

 public class ReverseLL
{
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of LL: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of LL ");
        Node head = new Node(sc.nextInt());
        Node temp = head;
        for(int i=1;i<n;i++){
            Node a = new Node(sc.nextInt());
            temp.next = a;
            temp = temp.next;
        }
        temp.next=null;
        Node pre = null;
        Node curr = head;
        Node Next = head;
        while(Next!=null){
            Next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=Next;
        }
        head=pre;  // pre become new head
        temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
