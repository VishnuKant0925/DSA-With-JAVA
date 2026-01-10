class SLL{
    Node head;
    Node tail;
    int size;
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null){
            head=tail=temp;
        }else{
           tail.next=temp;
           tail=temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            head=tail=temp;
        }else{
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
        if(idx == size){
            insertAtEnd(val);
            return;
        }
        if(idx<0 || idx>size){
            System.out.println("Invalid Index");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=1; i<=idx-1;i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next=temp;
        size++;
    }
    int getElement(int idx){
        if(idx==size-1) return tail.val;
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index");
            return -1;
        }
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }else{
            head=head.next;
        }
        if(head == null) tail = null;
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
            return ;
        }
        Node temp = head;
        for(int i=1 ;i<=idx-1;i++){
            temp=temp.next;
        }
        if(temp.next==tail) tail=temp;
        temp.next = temp.next.next;
        size--;
    }
    void printSize(){
        System.out.println("Size is : "+size);
    }
}
public class PractiseSLL {
    public static void main(String[] args) {
        SLL list= new SLL();
        list.insertAtEnd(12);
        list.insertAtEnd(2);
        list.insertAtHead(90);

        list.display();
        list.delete(1);
        list.display();
        list.printSize();
    }
}
