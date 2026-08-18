class Solution {
    public int strStr(String hay, String need) {
        int n = need.length();
        int h = hay.length();
        
        for (int i = 0; i <= h - n; i++) {
            int j = 0;
            while (j < n && hay.charAt(i + j) == need.charAt(j)) {
                j++;
            }
            if (j == n) {
                return i;
            }
        }
        return -1;
    }
}
