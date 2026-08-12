class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int bad = 0;
        int n = nums.length;

        for (int right = 0; right < n; right++) {
            int value = nums[right];
            int count = freq.getOrDefault(value, 0) + 1;
            freq.put(value, count);

            if (count == k + 1) {
                bad++;
            }
            if (bad > 0) {
                int leftValue = nums[left];
                int newCount = freq.get(leftValue) - 1;
                freq.put(leftValue, newCount);
                if (newCount == k) {
                    bad--;
                }
                left++;
            }
        }
        return n - left;
    }
}