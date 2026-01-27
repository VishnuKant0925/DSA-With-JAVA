class DNode {
    int val;
    DNode next;
    DNode pre;
    DNode(int val){
        this.val=val;
    }
}
public class DoublyLinkedListImplementation {
    public static void print(DNode head ){
        DNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void printReverse(DNode tail ){
        DNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.pre;
        }
        System.out.println();
    }
    public static void display(DNode any ){
        DNode temp = any;
        while(temp.pre!=null){
            temp=temp.pre;
        }
        //now temp is at head
        print(temp);
        System.out.println();
    }
    public static void main(String[] args) {
        DNode a = new DNode(10);
        DNode b = new DNode(20);
        DNode c = new DNode(30);
        DNode d = new DNode(40);
        a.next = b;
        b.next = c;  b.pre = a;
        c.next = d;  c.pre = b;
        d.pre = c;
        print(a);
        printReverse(d);
        display(c);
    }
}
