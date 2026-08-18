class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int count= 0;
        for(int i = 1 ; i < n - 1;i++){
            if(s.charAt(i) != s.charAt(i-1) && s.charAt(i) != s.charAt(i+1) && s.charAt(i-1) != s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}