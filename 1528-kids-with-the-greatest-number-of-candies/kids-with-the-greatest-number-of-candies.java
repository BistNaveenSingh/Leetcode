class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ext) {
        int max = 0;
        int n = candies.length;
        List<Boolean> ls = new ArrayList<>();

        for(int i = 0; i<n;i++){
            max = Math.max(max,candies[i]);
        }
        int i = 0;
        for(int candie : candies){
            if(ext + candie >= max){
                ls.add(true);
            }else{
                ls.add(false);
            }
        }
        return ls;
    }
}