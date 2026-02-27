class Solution {
    public int firstUniqChar(String s) {
        int[] alphabets = new int[26];
        for(int i = 0; i<s.length(); i++){
            alphabets[s.charAt(i) - 'a'] += 1;
        }
        for(int i = 0; i<s.length(); i++){
            if(alphabets[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}