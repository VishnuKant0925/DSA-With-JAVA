class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class Queue{
    Node head;
    Node tail;
    int size;
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    int peek(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        System.out.println();
        return head.val;
    }
    int remove(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.val;
        head=head.next;
        return front;
    }
    void add(int val){
        Node temp = new Node(val);
        if(size==0) head = tail = temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
}
public class LLImplementationOfQueue {
    public static void main(String[] args) {

        Queue q = new Queue();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.display();

    }
}
