class Solution {
    public int longestSubstring(String s, int k) {
        return divide(s,0,s.length()-1,k);
    }

    private int divide(String s, int start,int end,int k){
        if(end - start +1 <k){
            return 0;
        }
        int[] freq = new int[26];

        for(int i = start ; i <= end;i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = start; i <= end;i++){
            char ch = s.charAt(i);
            if(freq[ch-'a']<k){
                int next = i+1;
                while(next <= end && freq[s.charAt(next) - 'a'] < k){
                    next++;
                }
                int left = divide(s,start,i - 1,k);
                int right = divide(s,next,end,k);
                return Math.max(left,right);
            }
        }
        return end - start+1;
    }
}