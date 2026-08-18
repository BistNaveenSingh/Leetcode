class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int left = 0, right = ch.length - 1;

        while(left < right){
            
            while(left < right && !vowels.contains(ch[left])){
                left++;
            }
            while(left < right && !vowels.contains(ch[right])){
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
