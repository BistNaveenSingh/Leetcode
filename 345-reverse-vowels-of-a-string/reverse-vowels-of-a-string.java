class Solution {

    public boolean isvowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ;
    }
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length - 1;

        while(left < right){
            
            while(left < right && !isvowel(ch[left])){
                left++;
            }
            while(left < right && !isvowel(ch[right])){
                right--;
            }

            if(left < right ){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
            }
            left++;
            right--;
        }
        return new String(ch);
    }
}
