class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> ht = new HashMap<>();
        if(s.length() != t.length()) return false;

        int[] alphabets = new int[26];

        for(int i = 0; i<s.length(); i++){
            alphabets[s.charAt(i) - 'a'] += 1;
        }

        for(int i = 0; i<t.length(); i++){
            if(alphabets[t.charAt(i) - 'a'] == 0) return false;
            alphabets[t.charAt(i) - 'a'] -= 1;
        }
        return true;
    }
}