class DLL{
    DNode head;
    DNode tail;
    int size;
    void display(){
        DNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void insertAtTail(int val){
        DNode temp = new DNode(val);
        if(size==0) head=tail=temp;
        else{
            tail.next = temp;
            temp.pre = tail;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        DNode temp = new DNode(val);
        if(size==0) head=tail=temp;
        else{
            temp.next=head;
            head.pre=temp;
            head=temp;
        }
        size++;
    }
    void insert(int idx , int val){
        DNode temp = new DNode(val);
        if(idx==0) {
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        if(idx>size || idx<0) {
            System.out.println("------: Invalid Index :------");
            return;
        }
        DNode x = head;
        for(int i=1;i<idx;i++){
            x=x.next;
        }
        DNode y = x.next;
        x.next = temp;  temp.pre = x;
        temp.next = y;  y.pre = temp;
        size++;
    }
    void deleteAtHead(){
        if(head==null) {
            System.out.println("List is empty ");
            return;
        }
        head=head.next;
        head.pre=null;
        size--;
    }
    void deleteAtTail(){
        if(head==null){
            System.out.println("List is empty ");
            return;
        }
        tail=tail.pre;
        tail.next=null;
        size--;
    }
    void delete(int idx){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(idx==0) {
            deleteAtHead();
            return;
        }
        if(idx==size-1){
            deleteAtTail();
            return;
        }
        if(idx<0 || idx>=size){
            System.out.println("Invalid index");
            return;
        }
        DNode temp = head;
        for(int i=1 ; i<idx ;i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        temp=temp.next;
        temp.pre=temp.pre.pre;
        size--;
    }
    void set (int idx,int val){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(idx<0 || idx>=size){
            System.out.println("Invalid index");
            return;
        }
        DNode temp = head;
        if(idx==0) {
            head.val=val;
            return;
        }
        if(idx==size-1){
            tail.val=val;
            return;
        }
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        temp.val=val;
    }
    void  get (int idx){
        if(head==null){
            System.out.println("List is empty");
            return ;
        }
        if(idx==size-1){
            System.out.println(tail.val);
            return;
        }
        if(idx == 0){
            System.out.println(head.val);
            return;
        }
        if(idx<0 || idx>=size){
            System.out.println("Invalid index");
            return ;
        }
        DNode temp = head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        System.out.println(temp.val);
    }
}
public class DoublyLinkedListDataStructure {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtHead(5);
        list.display();
        list.insert(2,60);
        list.set(2,100);
        list.display();
        list.get(2);
    }
}
