import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static  void reverseQueue(Queue<Integer> q) {
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(q.remove());
        }
        for(int i=0;i<n;i++){
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        System.out.println(q);
        reverseQueue(q);
        System.out.println(q);
    }
}
