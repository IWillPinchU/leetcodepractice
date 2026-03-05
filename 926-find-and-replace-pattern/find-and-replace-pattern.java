class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for(String s:words){
            if(s.length() != pattern.length()) break;
            char[] sMap = new char[26];
            char[] patternMap = new char[26];
            boolean flag = true;
            for(int i = 0; i<s.length(); i++){
                char c1 = s.charAt(i);
                char c2 = pattern.charAt(i);
                if(sMap[c1 - 'a'] == 0 && patternMap[c2  - 'a'] == 0){
                    sMap[c1  - 'a'] = c2;
                    patternMap[c2  - 'a'] = c1;
                }
                else if(sMap[c1  - 'a'] != c2 || patternMap[c2  - 'a'] != c1){
                    flag = false;
                    break;
                }
            }
            if(flag) result.add(s);
        }
        return result;
    }
}