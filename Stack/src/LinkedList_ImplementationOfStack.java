public class LinkedList_ImplementationOfStack {
    static class Node{
        int val ;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static class Stack{
        Node head = null;
        int size;

        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null) {
                System.out.println("Stack is empty ");
                return -1;
            }
            int x = head.val;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            if(head == null ){
                System.out.println("Stack is empty ");
                return -1;
            }
            int value = head.val;
            return value;
        }
        boolean isEmpty(){
            if(head==null) return true;

            return false;
        }
        void display(){
            displayRecursive(head);
            System.out.println();
        }
        void displayRecursive(Node head){
            if(head==null) return;
            displayRecursive(head.next);
            System.out.println(head.val);
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display();
        st.push(50);
        st.display();
        st.pop();
        System.out.println(st.isEmpty());
        st.display();
    }
}
