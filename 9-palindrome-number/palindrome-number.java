class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0){
            return false ;
        }
        return check(x,x,0);
    }

    private boolean check(int org, int n , int rev){
        if( n == 0){
            return org == rev;
        }

        rev = rev * 10 + n% 10;
        return check(org,n/10,rev);
    }
}