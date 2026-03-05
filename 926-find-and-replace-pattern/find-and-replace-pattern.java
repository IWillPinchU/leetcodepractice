class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for(String s:words){
            int flag = 1;
            for(int i = 0; i<s.length(); i++){
                if(s.indexOf(s.charAt(i)) != pattern.indexOf(pattern.charAt(i))) flag = 0;
            }
            if(flag == 1) result.add(s);
        }
        return result;
    }
}