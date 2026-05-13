public class DequeueImplementationUsingDLL {
    static class Node{
        int val;
        Node next;
        Node pre;
        Node(int val){
            this.val=val;
        }
    }
    static  class DeQueue{
        Node front;
        Node rear;
        int size;

        boolean isEmpty(){
            if(size == 0){
                return  true;
            }
            return false;
        }

        int size(){
            return size;
        }
        void insertFront(int value){
            Node temp = new Node(value);
            if(front==null){
               rear = front = temp;
            }else{
                temp.next = front;
                front.pre=temp;
                front = temp;
            }
            size++;
        }
        void insertRear(int value){
            Node newNode = new Node(value);
            if(front==null){
                //dequeue is empty
                front=rear=newNode;
            }
            else{
                newNode.pre=rear;
                rear.next=newNode;
                rear=newNode;
            }
            size++;
        }
        void deleteFront(){
            if(size==0){
                System.out.println("Underflow");
            }else{
                Node temp = front;
                front=front.next;
                if(front==null){
                    // dequeue become empty
                    rear=null;
                }
                else{
                    front.pre=null;
                }
                size--;
            }
        }
        void deleteRear(){
            if(size==0){
                System.out.println("Underflow");
            }else{
                Node temp = rear;
                rear=rear.pre;
                if(rear==null){
                    // dequeue is empty
                    front=null;
                }else{
                    rear.next=null;
                }
                size--;
            }
        }
        int getFront(){
            if(size==0){
                System.out.println("underflow");
                return -1;
            }
            return front.val;
        }
        int getRear(){
            if(size==0){
                System.out.println("underflow");
                return -1;
            }
            return rear.val;
        }
    }
    public static void main(String[] args) {

        DeQueue dq = new DeQueue();
        dq.insertFront(10);
        dq.insertRear(20);
        System.out.println(dq.getFront());
        dq.deleteFront();
        System.out.println(dq.getFront());

    }
}
