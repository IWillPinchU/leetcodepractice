class Solution {
    
    public String sortVowels(String s) {
        char[] vowel = new char[s.length()];
        char[] string = s.toCharArray();
        int idx = 0;

        for(int j = 0; j<s.length(); j++){
            if("aeiouAEIOU".indexOf(string[j]) != -1){
                vowel[idx] = string[j];
                string[j] = '0';
                idx++;
            }
        }
        Arrays.sort(vowel, 0, idx);
        
        idx = 0;
        for(int j = 0; j<s.length(); j++){
            if(string[j] == '0'){
                string[j] = vowel[idx];
                idx++;
            }
        }
        return new String(string);
    }
}