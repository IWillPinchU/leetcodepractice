class Solution {
    public String removeStars(String s) {
        int i = 0;
        char[] result = new char[s.length()];

        for(char c: s.toCharArray()){
            if(c == '*') i--;
            else{
                result[i] = c;
                i++;
            }
        }

        return new String(result, 0, i);
    }
}