class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        if(root == null){
            return ls;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> currlvl = new ArrayList<>();
            for(int i = 0; i < size;i++){
                TreeNode vist =  q.poll();
                if(vist.left != null){
                    q.offer(vist.left);
                }
                if(vist.right != null){
                    q.offer(vist.right);
                }
                currlvl.add(vist.val);
            }
            ls.add(currlvl);
        }
        return ls;
    }
}