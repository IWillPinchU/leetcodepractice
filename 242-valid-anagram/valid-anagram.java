class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() ) return false;
        
        int[] sChars = new int[26];

        for(char c:s.toCharArray()){
            sChars[c - 'a'] += 1;
        }

        for(char c:t.toCharArray()){
            if(sChars[c - 'a'] == 0) return false;
            sChars[c - 'a'] -= 1;
        }

        return true;
    }
}