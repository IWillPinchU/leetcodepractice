class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1) return s.length();
        int n = s.length();

        int result = 0;

        for(int i = 0; i < n; i++){
            if(result >= n - i) break;
            String temp = LongestSubstring(s.substring(i));
            if(temp.length() > result) result = temp.length();
        }

        return result;
    }

    public String LongestSubstring(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(sb.indexOf(String.valueOf(s.charAt(i))) == -1) sb.append(s.charAt(i));
            else break;
        }

        return sb.toString();
    }
}