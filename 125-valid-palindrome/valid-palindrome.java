class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        if (s.length() == 1) {
            return true;
        }
        while(i<j){
            if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))){
                if(s.charAt(i) != s.charAt(j)) return false;
                i++;
                j--;
            }
            else if(!Character.isLetterOrDigit(s.charAt(i))) i++;
            else if(!Character.isLetterOrDigit(s.charAt(j))) j--;
        }
        return true;
    }
}