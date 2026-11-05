class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = arr1.length;
        int k = arr2.length;
        int valid = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < k; j++) {
                if (Math.abs(arr1[i] - arr2[j]) > d) {
                    count++;
                }
            }
            if (count == k ) {
                valid++;
            }
        }

        return valid;
    }
}