class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 , right  =0, max = 0;

        Set<Character> set = new HashSet<>();

        for(right=0; right < s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max = Math.max(max,right-left+1);
        }
    return max;
    }
}