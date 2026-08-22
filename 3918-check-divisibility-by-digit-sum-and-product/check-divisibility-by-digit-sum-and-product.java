class Solution {
    public boolean checkDivisibility(int num) {
        int sum = 0;
        int mul = 1;
        int n = num ;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            mul *= digit;
            n /= 10;
        }

        return num % ( sum + mul ) == 0 ;
    }
}