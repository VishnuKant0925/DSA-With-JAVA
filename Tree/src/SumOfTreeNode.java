public class SumOfTreeNode {
    static  class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }

    private static void display(Node root){
        if(root==null) return ; // base-case
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static  int sum (Node root){
        if(root==null){
            return 0;
        }
        return root.val+sum(root.left) + sum(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1); // a is root
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(20);
        Node e = new Node(3);
        Node f = new Node(30);
        Node g = new Node(40);

        // connect the children
        a.left = b ; a.right = c;
        b.left = d ; b.right = e;
        c.right = f; c.left = g ;

        display(a);
        System.out.println();
        System.out.println(sum(a));
    }
}

