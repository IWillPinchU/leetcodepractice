class Solution {
    public String reverseVowels(String s) {
        if(s.length() == 1) return s;
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        char[] string = s.toCharArray();
        
        int i = 0;
        int j = string.length - 1;

        while(i<j){
            if(vowels.contains(string[i]) && vowels.contains(string[j])){
                char temp = string[i];
                string[i] = string[j];
                string[j] = temp;
                i++;
                j--;
            }
            else{
                if(!vowels.contains(string[i])) i++;
                else j--;
            }
        }
        return new String(string);
    }
}