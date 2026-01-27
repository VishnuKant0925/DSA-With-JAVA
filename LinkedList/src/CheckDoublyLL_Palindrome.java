public class CheckDoublyLL_Palindrome {
    public static boolean palindrome(DNode head , DNode tail){
        while(head!=tail){
            if(head.val!=tail.val) return false;
            head=head.next;
            tail=tail.pre;
        }
        return true;
    }
    public static void main(String[] args) {
        DNode a = new DNode(10);
        DNode b = new DNode(90);
        DNode c = new DNode(20);
        DNode d = new DNode(10);
        a.next = b;
        b.next = c;  b.pre = a;
        c.next = d;  c.pre = b;
        d.pre = c;
        System.out.println(palindrome(a,d));
    }
}
