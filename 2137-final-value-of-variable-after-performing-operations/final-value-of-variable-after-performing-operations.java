class Solution {
    public int finalValueAfterOperations(String[] ops) {
        int sum = 0;
        for(String op :ops){
            if(op.equals("X++")||op.equals("++X")){
                sum++;
            }
            else{
                sum--;
            }
        }
        return sum;
    }
}