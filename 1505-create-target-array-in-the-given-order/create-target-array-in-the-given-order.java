class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList<Integer> ls = new ArrayList<>();
        int[] ans = new int[n];

        for(int i = 0;i<n;i++){
            ls.add(index[i],nums[i]);
        }

        for(int i = 0;i < n;i++){
            ans[i] = ls.get(i);
        }

        return ans;
    }
}