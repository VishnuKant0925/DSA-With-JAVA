import java.util.LinkedList;
import java.util.Queue;

public class ImplementingMethodsOfQueue {
    public static void addAtIndex(Queue<Integer> q , int idx ,int val){
        if(idx<0 || idx>q.size()){
            System.out.println("Invalid Index");
            return;
        }
        int n =q.size();
        for(int i=0 ; i<idx ; i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i=0;i<n-idx;i++){
            q.add(q.remove());
        }
    }
    public static void display(Queue<Integer> q){
        int n = q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static int Peek(Queue<Integer> q , int idx){
        int n = q.size();
        if(idx<0 || idx>=n){
            System.out.println("Invalid Index ");
            return -1;
        }

        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
        int res = q.peek();
        for(int i=0;i<n-idx;i++){
            q.add(q.remove());
        }
        return res;
    }
    public static int Remove(Queue<Integer> q , int idx){
        if(idx<0 || idx>=q.size()){
            System.out.println("Invalid Index");
            return -1;
        }
        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
        int res = q.remove();
        for(int i=0;i<q.size()-idx;i++){
            q.add(q.remove());
        }
        return res;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        display(q);
        addAtIndex(q,4,80);
        display(q);
        System.out.println(Peek(q,4));
        display(q);
        System.out.println(Remove(q,4));
        display(q);
    }
}
