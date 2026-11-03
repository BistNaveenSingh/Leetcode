class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int n : nums){
            max = Math.max(max , n);
        }
        int moves=0;
        for( int i = 0; i < nums.length ; i++){
            while(max != nums[i]){
                nums[i] += 1;
                moves++;
            }
        }
        return moves ;
    }
}