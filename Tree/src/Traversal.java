import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Traversal {
    static int  n;
    static class Node{
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
    private static int levelOfTree(Node root){
        if(root==null) return 0;
        return 1 + Math.max( levelOfTree(root.left) , levelOfTree(root.right) );
    }

    private static void LevelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }
    }

    private static void nthLevel(Node root ,int level){
        if(root==null) return ; // base-case
        if(level == n ){
            // we are arrived at the level which is to be printed
            System.out.print(root.val+" ");
        }
        nthLevel(root.left,level+1);
        nthLevel(root.right ,level+1);
    }

    private static void preorder(Node root){
        if(root==null) return ; // base-case
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(Node root){
        if(root==null) return ; // base-case

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    private static void postorder(Node root){
        if(root==null) return ; // base-case

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

    private static void ReversePreorder(Node root){
        if(root==null) return ; // base-case
        System.out.print(root.val+" ");
        ReversePreorder(root.right);
        ReversePreorder(root.left);
    }
    private static void ReverseInorder(Node root){
        if(root==null) return ; // base-case

        ReverseInorder(root.right);
        System.out.print(root.val+" ");
        ReverseInorder(root.left);
    }

    private static void ReversePostorder(Node root){
        if(root==null) return ; // base-case

        ReversePostorder(root.right);
        ReversePostorder(root.left);
        System.out.print(root.val+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        display(a);
        System.out.println();
        System.out.print("Preorder: ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder: ");
        postorder(a);
        System.out.println();
        System.out.println("Enter the level to printed (root consider as 0) :");
        n = sc.nextInt();
        nthLevel(a,0);
        System.out.println();
        // level order traversal using nthLevel() code
        int lvl = levelOfTree(a);
        for(int x=0;x<=lvl;x++){
            n=x;
            nthLevel(a,0);
            System.out.println();
        }
    }
}
