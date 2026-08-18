class Solution {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        int n = sb.length();
        int l = 0;
        int r = n - 1;
        while(l <= r){
            if(sb.charAt(l) != sb.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }

    public String firstPalindrome(String[] words) {
        for(String word : words){
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }
}