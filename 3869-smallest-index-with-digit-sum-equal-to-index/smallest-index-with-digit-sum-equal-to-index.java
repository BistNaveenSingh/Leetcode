class Solution {
    public int smallestIndex(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i < n;i++){
            int numb = nums[i];
            if(numb >= 10){
                sum = 0;
                while(numb != 0){
                    int digit = numb % 10;
                    sum += digit;
                    numb /= 10;
                }
            }else{
                sum = nums[i];
            }
            if(sum == i){
                return i;
            }
        }
        return -1;
    }
}