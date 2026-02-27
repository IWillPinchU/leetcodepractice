class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> ht = new HashMap<>();
        if(s.length() != t.length()) return false;

        for(char c:s.toCharArray()){
            ht.put(c,ht.getOrDefault(c,0) + 1);
        }

        for(char c:t.toCharArray()){
            if(ht.containsKey(c)){
                ht.put(c,ht.getOrDefault(c,0) - 1);
                if(ht.get(c) == 0) ht.remove(c);
            }
            else return false;
        }
        return true;
    }
}