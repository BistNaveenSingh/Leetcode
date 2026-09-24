class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length;i++){
            int numb = nums[i];
            int sum = 0;
            while(numb > 0 ){
                sum += numb%10;
                numb /= 10;
            }
            if(sum == i) return i;
        }
        return -1;
    }
}