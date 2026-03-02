class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        if (s.length() == 1) {
            return true;
        }
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return checkAfterDeletion(i + 1, j, s) || checkAfterDeletion(i, j - 1, s);
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean checkAfterDeletion(int i, int j, String s){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}