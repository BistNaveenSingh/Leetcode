class Solution {
    List<Integer> ls = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return ls;
    }

    private void  preorder(TreeNode root){
        if( root == null) return ;
        ls.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}