class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int newSum = 0;
        for(int g : gain){
            sum += g;
            newSum = Math.max(newSum,sum);
        }

        return newSum;
    }
}