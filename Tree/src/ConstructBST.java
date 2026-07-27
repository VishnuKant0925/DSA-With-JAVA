class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class ConstructBST {
    public static TreeNode buildBST(TreeNode root , int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(root.val > val){
            root.left = buildBST(root.left , val);
        }else{
            root.right = buildBST(root.right,val);
        }
        return root;
    }
    public static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {2,5,10,8,7,1};
        TreeNode root = new TreeNode(arr[0]);
        for(int i=1;i<arr.length;i++){
             buildBST(root,arr[i]);
        }
        inorder(root);
    }

}
