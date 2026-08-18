class Solution {

    public boolean isvowel(char ch){
        if( ch == 'a' ||  ch =='e'||  ch =='i'||  ch =='o'||  ch =='u'){
            return true;
        }
        return false;
    }

    public int maxVowels(String s, int k) {
        int n = s.length();
        int vcount = 0;

        for(int i = 0 ;i < k ; i++){
            if(isvowel(s.charAt(i))){
                vcount++;
            }
        }
        int max = vcount;

        for(int i = k ; i< n ;i++){
            if(isvowel(s.charAt(i))){
                vcount++;
            }
            if(isvowel(s.charAt(i-k))){
                vcount--;
            }

            max  = Math.max(max,vcount);

            if(max == k){
                return max;
            }
        }

        return max;
        
    }
}

