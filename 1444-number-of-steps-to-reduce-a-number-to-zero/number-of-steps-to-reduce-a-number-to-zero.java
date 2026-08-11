class Solution {
    public int numberOfSteps(int num) {
        int count= 0;
        int curr = num;
        while(curr > 0){
            if(curr % 2 == 0){
                curr = curr /2 ;
                count++;
            }else{
                curr = curr -1 ;
                count++;
            }
        }
        return count;
    }
}