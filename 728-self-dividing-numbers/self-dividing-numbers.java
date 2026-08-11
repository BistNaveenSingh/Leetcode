class Solution {
    private boolean check(int num ){
        int n = num ;
        while(n > 0){
            int digit = n % 10;
            if(digit == 0|| num % digit != 0){
                return false;
            }
            n /= 10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ls = new ArrayList<>();

        for(int i = left ; i <= right;i++){
            if(check(i)){
                ls.add(i);
            }
        }
        return ls;
    }

}