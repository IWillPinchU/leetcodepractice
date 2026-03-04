class Solution {
    public String reverseOnlyLetters(String s) {
        char[] string = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if (Character.isLetter(string[i]) && Character.isLetter(string[j])){
                char temp = string[i];
                string[i] = string[j];
                string[j] = temp;
                i++;
                j--;
            }
            else{
                if(!Character.isLetter(string[i])) i++;
                else j--;
            }
        }
        return new String(string, 0, s.length());
    }
}