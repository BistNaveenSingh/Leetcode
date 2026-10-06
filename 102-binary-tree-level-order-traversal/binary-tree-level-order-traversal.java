class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        Order(root,result,0);
        return result;
    }

    private void Order(TreeNode root, List<List<Integer>> res, int level){
        if(root==null){
            return;
        }

        if(res.size()==level){
            res.add(new ArrayList<>());
        }

        res.get(level).add(root.val);

        Order(root.left,res,level+1);
        Order(root.right,res,level+1);
    }
}
