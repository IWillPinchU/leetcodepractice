class Solution {
    public String longestPalindrome(String s) {
        String maxLength = "";
        for(int i = 0; i < s.length(); i++){
            String temp = String.valueOf(s.charAt(0));
            temp = expand(s, maxLength, i, i);
            if(temp.length() > maxLength.length()) maxLength = temp;
            temp = expand(s, maxLength, i, i + 1);
            if(temp.length() > maxLength.length()) maxLength = temp;
        }
        return maxLength;
    }

    public String expand(String s,String maxLength, int i, int j){
        StringBuilder sb= new StringBuilder();
        while(i >= 0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        sb.append(s,i+1,j);
        return sb.toString();
    }
}