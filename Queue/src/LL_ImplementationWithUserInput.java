import java.util.*;



class Queue1 {
    Node head;
    Node tail;
    int size;

    public void enqueue(int val) {
        Node temp = new Node(val);
        if (size == 0) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int dequeue() {
        if (size == 0) return -1;
        int front = head.val;
        head = head.next;
        size--;
        return front;
    }

    public int peek() {
        if (size == 0) return -1;
        return head.val;
    }

    public int size() {
        return size;
    }
}

public class LL_ImplementationWithUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // number of operations
        Queue1 q = new Queue1();

        for (int i = 0; i < n; i++) {
            String op = sc.next();

            if (op.equals("enqueue")) {
                int val = sc.nextInt();
                q.enqueue(val);
            }
            else if (op.equals("dequeue")) {
                int res = q.dequeue();
                if (res == -1) System.out.print("Queue is empty, cannot dequeue. ");
                else System.out.print(res + " ");
            }
            else if (op.equals("peek")) {
                int res = q.peek();
                if (res == -1) System.out.print("Queue is empty. ");
                else System.out.print(res + " ");
            }
            else if (op.equals("size")) {
                System.out.print(q.size() + " ");
            }
        }
    }
}

