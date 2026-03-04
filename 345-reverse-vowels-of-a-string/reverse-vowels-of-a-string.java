class Solution {

    public boolean isValid(char c){
        char low = Character.toLowerCase(c);
        if(low=='a'||low=='e'||low=='i'||low=='o'||low=='u') return true;
        return false;
    }
    public String reverseVowels(String s) {
        if(s.length() == 1) return s;
        char[] string = s.toCharArray();
        
        int i = 0;
        int j = string.length - 1;

        while(i<j){
            if(!isValid(string[i])) i++;
            else if(!isValid(string[j])) j--;
            else{
                char temp = string[i];
                string[i] = string[j];
                string[j] = temp;
                i++;
                j--;
            }
        }
        return new String(string);
    }
}