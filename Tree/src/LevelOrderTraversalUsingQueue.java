import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalUsingQueue {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    static class Pair{
        Node node;
        int level;
        Pair(Node node , int level){
            this.node = node ;
            this.level = level;
        }
    }
    private static void LevelOrderTraversal(Node root){
        Queue<Pair> q = new LinkedList<>();
        int preLevel=0;
        Pair p = new Pair(root,0);
        if(root != null)  q.add(p);
        while(!q.isEmpty()){
            Pair temp = q.remove();
            Node front = temp.node;
            int lvl = temp.level;
            if(lvl != preLevel){
                System.out.println();
                preLevel++;
            }
            System.out.print(front.val+" ");
            if(front.left != null) q.add(new Pair(front.left,lvl+1));
            if(front.right != null) q.add(new Pair(front.right,lvl+1));
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1); // a is root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        // connect the children
        a.left = b ; a.right = c;
        b.left = d ; b.right = e;
        c.left = f; c.right = g ;
        e.left = h ; f.right = i;
        LevelOrderTraversal(a);
    }
}
