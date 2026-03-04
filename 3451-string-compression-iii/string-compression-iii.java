class Solution {
    public String compressedString(String word) {
        char[] result = new char[2 * word.length()];
        int idx = 0;
        char last = word.charAt(0);
        int count = 1;
        for(int i = 1; i<word.length(); i++){
            char c = word.charAt(i);
            if(count<9 && c == last){
                count++;
            }
            else{
                result[idx++] = (char) ('0' + count);
                result[idx++] = last;
                count = 1;
                last = c;
            }
        }
        result[idx++] = (char) ('0' + count);
        result[idx++] = last;
        return new String(result, 0, idx);
    }
}