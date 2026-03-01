class Solution {
    public String removeDuplicates(String s) {
        for(int i = 0; i<s.length() - 1; i++){
            if (s.charAt(i) == s.charAt(i+1)){
                s = s.substring(0,i) + s.substring(i+2, s.length());
                i = Math.max(i - 2, -1);
            }
        }
        return s;
    }
}