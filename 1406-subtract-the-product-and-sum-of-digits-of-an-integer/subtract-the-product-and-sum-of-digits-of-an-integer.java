class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prd = 1;
        while(n > 0){
            int digit = n % 10;
            prd *= digit;
            sum += digit;
            n = n /10;
        }

        return prd - sum ;
    }
}