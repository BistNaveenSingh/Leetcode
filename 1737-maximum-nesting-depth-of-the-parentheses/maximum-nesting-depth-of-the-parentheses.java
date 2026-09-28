class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxCount = count;
        char[] charString = s.toCharArray();
        for(char ch : charString){
            if(ch == '('){
                count++;
            }else if(ch == ')'){
                count--;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;    
    }
}