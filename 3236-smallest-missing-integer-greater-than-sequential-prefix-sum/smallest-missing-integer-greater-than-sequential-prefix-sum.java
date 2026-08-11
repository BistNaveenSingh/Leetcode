class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;

        Set<Integer> found = new HashSet<>(n);

        for(int num : nums){
            found.add(num);
        }
        int sum = nums[0];

        for(int i = 1; i < n;i++){
            if(nums[i] == nums[i - 1] + 1){
                sum += nums[i];
            }
            else break;
        }

        while(found.contains(sum)){
            sum++;
        }

        return sum;
    }
}
