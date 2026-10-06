class Solution {
    ArrayList<Integer> ls = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        preorder(root);
        return ls;
    }

    void  preorder(TreeNode root){
        if( root == null) return ;
        preorder(root.left);
        preorder(root.right);
        ls.add(root.val);
    }
    }

