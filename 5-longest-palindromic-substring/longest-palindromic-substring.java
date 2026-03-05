class Solution {
    public String longestPalindrome(String s) {
        String maxLength = String.valueOf(s.charAt(0));
        for(int i = 0; i < s.length(); i++){
            String odd = expand(s, i, i);
            if(odd.length() > maxLength.length()) maxLength = odd;
            String even = expand(s, i, i + 1);
            if(even.length() > maxLength.length()) maxLength = even;
        }
        return maxLength;
    }

    public String expand(String s, int i, int j){
        while(i >= 0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}