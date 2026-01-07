class SinglyLinkedList{
    private Node head;
    private Node tail;
    private int size;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insert(int idx , int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        if(idx>size || idx<0){
            System.out.println("Invalid Index ");
            return;
        }
        Node temp = new Node(val);
        Node x = head;

        for(int i=1;i<=idx-1;i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }

    int get(int idx){
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0){
            System.out.println("Invalid Index");
            return -1;
        }
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    void set(int idx, int val){
        if(idx==size-1) {
            tail.val=val;
            return;
        }
        if(idx>=size || idx<0){
            System.out.println("Invalid Index");
            return ;
        }
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        temp.val=val;
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }
    void delete(int idx){
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(head==null){
            System.out.println("List is empty ");
            return;
        }
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index");
            return;
        }
        Node temp = head;
        for(int i=1; i<=idx-1;i++){
            temp=temp.next;
        }
        if(temp.next==tail) tail = temp;
        temp.next = temp.next.next;
        size--;

    }
    void size(){
        System.out.println("Length of LinkedList is :"+size);
    }
    void display(){
        Node temp= head;
        while (temp !=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class ImplementationOf_LInkedList {
    public static void main(String[] args) {
         SinglyLinkedList list = new SinglyLinkedList();
         list.insertAtEnd(10);
         list.insertAtEnd(70);
         list.insertAtEnd(80);
         list.insertAtEnd(30);
         list.insertAtHead(-90);
         list.insert(2,100);
         list.display();
         list.insert(10,100);

         list.insert(5,10);
         list.size();
         list.display();
        // System.out.println(list.get(2));
        list.set(0,102);
        list.display();
        list.delete(3);
        list.display();

    }
}
