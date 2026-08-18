class Solution {

    public boolean isvowel(char ch){
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        if(vowels.contains(ch)){
            return true ;
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

