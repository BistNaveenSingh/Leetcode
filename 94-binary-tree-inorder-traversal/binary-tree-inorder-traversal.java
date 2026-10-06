class Solution {
    ArrayList<Integer> ls = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        preorder(root);
        return ls;
    }

    void  preorder(TreeNode root){
        if( root == null) return ;
        preorder(root.left);
        ls.add(root.val);
        preorder(root.right);
    }
}